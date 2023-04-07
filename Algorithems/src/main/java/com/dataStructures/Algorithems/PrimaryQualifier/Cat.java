package com.dataStructures.Algorithems.PrimaryQualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class Cat implements Animal {
    @Override
    public String characteristics() {
        return "The cat's independent personality, grace, cleanliness, and subtle displays of affection have wide appeal. Typically, cats are creatures of habit; they are inquisitive, but not adventurous, and are easily upset by sudden changes of routine.";
    }
}
