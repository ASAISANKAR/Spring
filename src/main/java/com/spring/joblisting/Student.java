package com.spring.joblisting;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
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
