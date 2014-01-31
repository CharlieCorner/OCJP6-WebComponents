package com.foo.models;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 *
 * @author Charlie
 */
public class PersonalInfo implements HttpSessionBindingListener{
    
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    @Override
    public String toString(){
        return this.userName;
    }

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println(this + " user has been added to session " + event.getSession().getId());
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println(this + " user has been removed to session " + event.getSession().getId());
    }
    
}
