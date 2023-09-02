package com.wipro.SpringBootLearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
	
    private int rno;
    private String name;
    @Autowired
    private Address add;

    public Student()
    {
        System.out.println("Constructor of Student");
    }
    public Student(int r, String s)
    {
        this.rno= r; this.name=s;
        System.out.println("constructor");
    }
    public void setRno(int r)
    {
        this.rno = r;
    }
    public void setName(String s)
    {
        this.name = s;
    }
    public int getRno()
    {
        return this.rno;
    }
    public String getName()
    {
        return this.name;
    }

    public void Display()
    {
        System.out.println("Rno: "+ this.rno + " Name: " + this.name);
        System.out.println("The Address is :" + add);
        //System.out.println("test");
    }
    

 

 

}