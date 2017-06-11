package com.stanchenko.logger;

public class AopLogger {
    public void beforeMethodCalled() {
        System.out.println("AOP: AopLogger.beforeMethodCalled()");
    }

    public void afterMethodCalled() {
        System.out.println("AOP: AopLogger.afterMethodCalled()");
    }
}
