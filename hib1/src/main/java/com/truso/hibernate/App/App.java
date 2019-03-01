package com.truso.hibernate.App;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.truso.hibernate.entity.Person;

public class App {
	
	public static void main(String[] args) {
		//session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Person.class)
				.buildSessionFactory();
				
		//session
		Session session = factory.getCurrentSession();
		
		try {
			System.out.println("Creating a new person object");
			Person temp = new Person("Marta", "Truso", "m.t@gmail.com");
			
			session.beginTransaction();
			
			System.out.println("Saving the person into db");
			session.save(temp);
			
			session.getTransaction().commit();
			System.out.println("commited");
			
		}
		finally {
			factory.close();
		}
	}

}
