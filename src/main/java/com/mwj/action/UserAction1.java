package com.mwj.action;

import com.mwj.model.User;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction1  extends ActionSupport{


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private User user;
    @Override
    public String execute() throws Exception {


        if ("mwj".equals(user.getName()) && "123".equals(user.getPwd()))
            return  "ok";
        else
            return

                    "error";
    }
}
