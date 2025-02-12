package github.guisofiati.firstejb.controller;

import github.guisofiati.firstejb.ejb.UserBean;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "userController")
@SessionScoped
public class UserController implements Serializable {
    
    @EJB
    private UserBean userBean;
    
    public UserController() {
        
    }
    
    public String infoUser() {
        return "index";
    }

    public UserBean getUserBean() {
        return userBean;
    }

    public void setUserBean(UserBean userBean) {
        this.userBean = userBean;
    }
    
}
