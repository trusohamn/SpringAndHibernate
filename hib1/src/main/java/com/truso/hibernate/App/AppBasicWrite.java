package com.truso.hibernate.App;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.truso.hibernate.entity.Person;

public class AppBasicWrite {
	
	public static void main(String[] args) {
		//session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Person.class)
				.buildSessionFactory();
				
		//session
		Session session = factory.getCurrentSession();
		
		try {
			//WRITE
			
			System.out.println("Creating a new person object");
			Person temp = new Person("M", "T", "m.t@gmail.com");
			
			session.beginTransaction();
			
			System.out.println("Saving the person into db");
			session.save(temp);
			
			session.getTransaction().commit();
			System.out.println("commited");
			
			//READ
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			System.out.println("getting person with id " + temp.getId());
			Person p = session.get(Person.class, temp.getId());
			System.out.println("Received " + p);
		}
		finally {
			factory.close();
		}
	}

}
