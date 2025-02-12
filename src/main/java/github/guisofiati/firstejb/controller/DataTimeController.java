package github.guisofiati.firstejb.controller;

import github.guisofiati.firstejb.ejb.DataTimeBean;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "dataTimeController") // (like JSF manegedBean)
@RequestScoped // life cycle
public class DataTimeController implements Serializable {
    
    @EJB // to be instanciate by server
    private DataTimeBean dataTimeBean;
    
    @Inject // get userController instance and inject here to use
    private UserController userController;
    
    public DataTimeController() {
        System.out.println("Controller instance created");
    }
    
    public String getUserName() {
        return userController.getUserBean().getUser() != null 
                ? userController.getUserBean().getUser() : "User not informed";
    }
    
    public DataTimeBean getDataTimeBean() {
        return dataTimeBean;
    }

    public void setDataTimeBean(DataTimeBean dataTimeBean) {
        this.dataTimeBean = dataTimeBean;
    }

    public UserController getUserController() {
        return userController;
    }

    public void setUserController(UserController userController) {
        this.userController = userController;
    }
    
}
