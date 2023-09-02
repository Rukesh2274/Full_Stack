package com.wipro.SpringBootLearn;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
    private int rno;
    private String name;

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

        //System.out.println("test");
    }
    

 

 

}