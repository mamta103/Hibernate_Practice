package com.love2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.love2code.hibernate.entity.Student;

public class PrimaryKeyDemo {
public static void main(String[] args) {
	
	SessionFactory factory= new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
	Session  session= factory.getCurrentSession();
	
	try{
		//Creating Object
		//Begin session transaction
		//saving object reference
		//session commit

		// create 3 student objects
					System.out.println("Creating 3 student objects...");
					Student tempStudent1 = new Student("John", "Doe", "john@luv2code.com");
					Student tempStudent2 = new Student("Mary", "Public", "mary@luv2code.com");
					Student tempStudent3 = new Student("Bonita", "Applebum", "bonita@luv2code.com");
					session.beginTransaction();
					// save the student object
					System.out.println("Saving the students...");
					session.save(tempStudent1);
					session.save(tempStudent2);
					session.save(tempStudent3);
					
					session.getTransaction().commit();
					System.out.println("Done!");

	}
	finally {
		factory.close();
	}
}
}
