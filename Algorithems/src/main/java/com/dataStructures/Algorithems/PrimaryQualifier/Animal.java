package com.dataStructures.Algorithems.PrimaryQualifier;

import java.util.Random;

public interface Animal {
    public String characteristics();

    default Double random(){
        return new Random().nextDouble();
    }

    static Double randomStatic(){
        return new Random().nextDouble();
    }
}
