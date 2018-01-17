package com.mwj.action;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor {
    public String intercept(ActionInvocation actionInvocation) throws Exception {


        System.out.println("begintime");
        long l = System.currentTimeMillis();

        String invoke = actionInvocation.invoke();
        long l1 = System.currentTimeMillis();
        long l2 = l-l1;
        System.out.println("endtime"+l2);
        return  invoke;
    }
}
