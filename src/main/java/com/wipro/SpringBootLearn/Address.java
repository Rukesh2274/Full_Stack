package com.wipro.SpringBootLearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Address {
	
	

	private String city;
    private String state;

    public Address() { System.out.println("Address Constructor");}
    public Address(String c, String s)
    {
        this.city = c;
        this.state = s;
    }
    public void setCity(String c) { this.city = c; }
    public void setState(String s) {this.state = s ; }
    public String getCity() { return this.city ;}
    public String getState() { return this.state ; }
    public void Display()
    {
        System.out.println("City:" + this.city + " State:" + this.state);
    }
}
