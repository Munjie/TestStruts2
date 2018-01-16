package com.mwj.action;

import com.mwj.model.User;
import com.mwj.service.UserServices;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class UserAction {


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private File myFile;
    private String  myFileFileName;

    public File getMyFile() {
        return myFile;
    }

    public void setMyFile(File myFile) {
        this.myFile = myFile;
    }

    public String getMyFileFileName() {
        return myFileFileName;
    }

    public void setMyFileFileName(String myFileFileName) {
        this.myFileFileName = myFileFileName;
    }

    private User user;
    private UserServices userServices = new UserServices();
    private List<User> display;

    public UserServices getUserServices() {
        return userServices;
    }

    public void setUserServices(UserServices userServices) {
        this.userServices = userServices;
    }

    public List<User> getDisplay() {
        return display;
    }

    public void setDisplay(List<User> display) {
        this.display = display;
    }

    public  String login(){
      try {
          String path = ServletActionContext.getRequest().getServletContext().getRealPath("/pic/");
          FileUtils.copyFile(myFile,new File(path +"/"+myFileFileName));
      } catch (IOException e) {
          e.printStackTrace();
      }


        if ("mwj".equals(user.getName()) && "123".equals(user.getPwd()))
            display = userServices.display();
            return  "ok";

    }
}
