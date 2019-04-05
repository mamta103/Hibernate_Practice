package com.love2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.love2code.hibernate.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		try {

			// Create Object Corresponding POJO class
			// Begin Transaction
			// Save Object
			// Closing Connection
		
			session.beginTransaction();
			
			//query the student
			List<Student> theStudents= session.createQuery("from Student").list();
			//display the student
			for(Student tempStudent:theStudents){
				System.out.println(tempStudent);
			}
			session.getTransaction().commit();
			System.out.println("Done!");

		} finally {
			sessionFactory.close();
		}

	}

}
