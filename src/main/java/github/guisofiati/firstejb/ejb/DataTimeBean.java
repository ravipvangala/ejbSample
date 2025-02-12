package github.guisofiati.firstejb.ejb;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class DataTimeBean implements Serializable {
    
    @EJB
    private CountBean countBean;
    
    public DataTimeBean() {
        System.out.println("Constructor DataTimeBean called");
    }
    
    public String getDataTimeServer() {
        countBean.increment();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(Calendar.getInstance().getTime());
    }
    
    @PostConstruct // when bean created, first of all call this method
    public void init() {
        System.out.println("Method init() DataTimeBean called");
    }
    
    @PreDestroy // before delete instance call this method
    public void destroy() {
        System.out.println("Method destroy() DataTimeBean called");
    }

    public CountBean getCountBean() {
        return countBean;
    }

    public void setCountBean(CountBean countBean) {
        this.countBean = countBean;
    }
    
}
