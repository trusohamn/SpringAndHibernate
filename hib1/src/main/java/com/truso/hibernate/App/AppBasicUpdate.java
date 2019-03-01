package com.truso.hibernate.App;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.truso.hibernate.entity.Person;

public class AppBasicUpdate {
	
	public static void main(String[] args) {
		//session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Person.class)
				.buildSessionFactory();
				
		//session
		Session session = factory.getCurrentSession();
		
		try {
			//UPDATE
			int id = 1;

			session.beginTransaction();
			
			System.out.println("Updating the person with id " + id);
			Person p = session.get(Person.class, id);
			p.setFirstName("George");
			
			session.getTransaction().commit();
			System.out.println("commited");
				
			
			//UPDATE WITH QUERY
			System.out.println("cleaning emails");
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			session.createQuery("update Person set email= ''")
			.executeUpdate();
			
			session.getTransaction().commit();
			System.out.println("commited");
			
		}
		finally {
			factory.close();
		}
	}

}
