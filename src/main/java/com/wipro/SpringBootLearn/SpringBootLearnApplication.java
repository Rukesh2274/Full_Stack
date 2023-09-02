package com.wipro.SpringBootLearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootLearnApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con = SpringApplication.run(SpringBootLearnApplication.class, args);
        Student s = con.getBean(Student.class);
        s.setName("Rukesh");
        s.setRno(2011);
        s.Display();
		
        /* Student s1 = con.getBean(Student.class);
        s1.setName("Rukesh1");
        s1.setRno(20113);
        s1.Display();
        */
	}

}
