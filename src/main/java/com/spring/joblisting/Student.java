package com.spring.joblisting;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Student {

    @Id
    String id;
    String name;
    public void setId(String id){
        this.id = id;
    }
    public void setName(String name)
{        this.name = name;
}    
    public String getId()
{        return id;
}    public String getName()
{        return name;
}
}

