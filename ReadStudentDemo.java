package com.love2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.love2code.hibernate.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		try {

			// Create Object Corresponding POJO class
			// Begin Transaction
			// Save Object
			// Closing Connection
			System.out.println("Creating new student object...");
			Student tempStudent = new Student("Duck", "daffy", "daffyduck@hotmail.com");
			session.beginTransaction();
			System.out.println("Saving the student...");
			session.save(tempStudent);
			session.getTransaction().commit();

			// MY NEW CODE
			// find out student primary id
			System.out.println("Saved student. Generated id: " + tempStudent.getId());

			// now get a new session and start transaction.
			// retrieve student based on the id: primary key.
			// commit transaction::
			session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			// retrieve student based on the id: primary key
			System.out.println("\nGetting student with id: " + tempStudent.getId());
			Student student = (Student) session.get(Student.class, tempStudent.getId());

			System.out.println("Done!");

		} finally {
			sessionFactory.close();
		}

	}

}
