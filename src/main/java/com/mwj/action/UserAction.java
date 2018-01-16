package com.mwj.action;

import com.mwj.model.User;

public class UserAction {


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private User user;

    public  String login(){

      if ("mwj".equals(user.getName()) && "123".equals(user.getPwd()))
        return  "ok";
      else
          return

          "error";
    }
}
