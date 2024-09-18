package com.springboot.hello;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value ="prototype")
// This prototype will remove the effect of singleton design pattern , The Number of time we call getBean it will give us object.
public class FirstController {
    private String name;
    private int age;
    // Constructor
    public FirstController(){
        System.out.println("Object Created");
    }// this will create object even we will not make object in out Application.

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String aname){
        this.name= aname;
    }
    public void setAge(int aage){
        this.age = aage;
    }
    public void show(){
        System.out.println("This is the first Controller of class");
    }

}
