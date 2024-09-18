package com.springboot.hello;

import org.springframework.stereotype.Component;

@Component
public class DemoController {
    private String PDetails;
    private String Address;

    public String getDetails(){
        return PDetails;
    }
    public String getAddress(){
        return Address;
    }
    public void setDetails(String PDetails){
        this.PDetails= PDetails;
    }
    public void setAddress(String Address){
        this.Address= Address;
    }
    public void display(){
        System.out.println("This statement is from Demo Controller");
    }
}
