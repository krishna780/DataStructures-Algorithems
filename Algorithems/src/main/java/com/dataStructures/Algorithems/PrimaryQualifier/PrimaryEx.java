package com.dataStructures.Algorithems.PrimaryQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimaryEx {

   @Autowired
   Animal dog;

    @RequestMapping(path = "/fetchChar",method = RequestMethod.GET )
    public String fetchChar(){
        System.out.println(dog.random());
        return  dog.characteristics();

    }

}
