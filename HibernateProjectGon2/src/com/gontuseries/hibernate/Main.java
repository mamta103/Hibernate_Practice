package com.gontuseries.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class Main {

	public static void main(String[] args) {
		
		
		// Write the Student_Info object into the database
		Student_Info student = new Student_Info();
		student.setName("Gontu");
		student.setRoll_no(2);

		
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		// this would save the Student_Info object into the database
		session.save(student);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
