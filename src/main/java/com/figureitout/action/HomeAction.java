package com.figureitout.action;

import com.figureitout.model.entities.Auth;
import com.figureitout.model.hibernate.HibernateUtil;
import com.opensymphony.xwork2.ActionSupport;
import javax.persistence.EntityManager;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

@Namespace("/")
@ResultPath("/")
@Action(value = "logintest", results = {
    @Result(name = "success", location = "index1.jsp"),
    @Result(name = "error", location = "index1.jsp")})
public class HomeAction extends ActionSupport {

    private String userId, pass, msg;

    @Override
    public String execute() throws Exception {
        
        System.out.println("here");

        SessionFactory sessionFactory = HibernateUtil.buildSession();

        Session session = sessionFactory.openSession();

        EntityManager entityManager = sessionFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Auth auth = new Auth();
        auth.setId(101);
        auth.setPassword("toto");
        
        entityManager.persist(auth);
        entityManager.getTransaction().commit();
        entityManager.close();

        if (pass.equalsIgnoreCase("admin")) {
            return SUCCESS;
        } else {
            msg = "You have entered the wrong password. Try again...";
            return ERROR;
        }
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
