package com.dataStructures.Algorithems.PrimaryQualifier;

import org.springframework.stereotype.Service;

@Service
public class Dog implements Animal {
    @Override
    public String characteristics() {
        return "Research indicates that dogs have personality traits such as calmness, boldness, trainability and sociability. Every owner knows their dog to perfection, and it is important for them to match activities to their dog's needs";
    }
}
