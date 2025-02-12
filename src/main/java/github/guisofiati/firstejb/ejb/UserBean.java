package github.guisofiati.firstejb.ejb;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateful;
import javax.ejb.StatefulTimeout;

@Stateful
@StatefulTimeout(unit = TimeUnit.MINUTES, value = 1)
public class UserBean implements Serializable {
    
    private String user;
    
    public UserBean() {
        
    }
    
    @PostConstruct
    public void init() {
        System.out.println("Method init() UserBean called");
    }
    
    @PreDestroy
    public void destroy() {
        System.out.println("Method destroy() UserBean called");
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
}
