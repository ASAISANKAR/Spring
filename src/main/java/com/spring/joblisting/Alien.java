package com.spring.joblisting;

import org.springframework.stereotype.Component;
@Component
public class Alien {
    int id;
    public int getId(){
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public void test(){
        System.out.println("Hello from test");
    }
}
