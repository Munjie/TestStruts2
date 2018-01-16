package com.mwj.service;

import com.mwj.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserServices {


    public List<User> display(){

        User user = new User("mwj","mwj");
        List<User> list = new ArrayList<User>();
        list.add(user);
        return  list;
    }
}
