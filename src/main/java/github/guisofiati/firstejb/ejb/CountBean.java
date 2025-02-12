package github.guisofiati.firstejb.ejb;

import java.io.Serializable;
import javax.ejb.Singleton;

@Singleton
public class CountBean implements Serializable {
    
    private Integer counter;
    
    public CountBean() {
        counter = 0;
    }
    
    public void increment() {
        counter++;
    }
        

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }
    
}
