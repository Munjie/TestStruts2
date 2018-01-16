package com.mwj.action;

import com.mwj.model.User;
import com.opensymphony.xwork2.Action;

public class UserAction2 implements Action{
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private User user;
    public String execute() throws Exception {

        if ("mwj".equals(user.getName()) && "123".equals(user.getPwd()))
            return  "ok";
        else
            return

                    "error";
    }
}
