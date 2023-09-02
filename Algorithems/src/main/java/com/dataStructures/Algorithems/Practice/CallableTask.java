package com.dataStructures.Algorithems.Practice;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "welcome to java";
    }
}
