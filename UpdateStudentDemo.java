package com.love2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.love2code.hibernate.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		try {

			// Create Object Corresponding POJO class
			// Begin Transaction
			// Save Object
			// Closing Connection

			int studentId = 1;
			// now get a new session and start transaction

			session = sessionFactory.getCurrentSession();
			session.beginTransaction();

			// retrieve student based on the id: primary key
			System.out.println("\nGetting student with id: " + studentId);

			Student theStudent = (Student) session.get(Student.class, studentId);
			System.out.println("Updating student...");
			theStudent.setFirstName("Mamta");
			
			session.getTransaction().commit();
			
			//New Code
			session= sessionFactory.getCurrentSession();
			 
			
			session.beginTransaction();
			// update email for all students
			System.out.println("Update email for all students");
			session.createQuery("update Student set email='foo@gmail.com'").executeUpdate();
			session.getTransaction().commit();
			System.out.println("Done!");

		} finally {
			sessionFactory.close();
		}

	}

}
