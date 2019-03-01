package com.truso.hibernate.App;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.truso.hibernate.entity.Person;

public class AppBasicQuery {
	
	public static void main(String[] args) {
		//session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Person.class)
				.buildSessionFactory();
				
		//session
		Session session = factory.getCurrentSession();
		
		try {
			//QUERY 
			
			session.beginTransaction();
			
			System.out.println("all persons:");
			List<Person> myList = session.createQuery("from Person").getResultList();	
			myList.forEach(e -> System.out.println(e));
		
			System.out.println("\nperson named Marta: ");
			myList = session.createQuery("from Person p where p.firstName = 'Marta'").getResultList();	
			myList.forEach(e -> System.out.println(e));
			
			session.getTransaction().commit();

			
		}
		finally {
			factory.close();
		}
	}

}
