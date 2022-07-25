package com.itheima.reggie.common;

import org.springframework.context.annotation.Configuration;

public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setThreadLocal(Long empId){
        threadLocal.set(empId);
    }

    public static Long getThreadLocal(){
        return threadLocal.get();
    }

}
