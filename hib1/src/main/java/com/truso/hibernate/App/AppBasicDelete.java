package com.truso.hibernate.App;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.truso.hibernate.entity.Person;

public class AppBasicDelete {
	
	public static void main(String[] args) {
		//session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Person.class)
				.buildSessionFactory();
				
		//session
		Session session = factory.getCurrentSession();
		
		try {
			//DELETE
			int id = 1;

			session.beginTransaction();
			
			System.out.println("Deleting the person with id " + id);
			Person p = session.get(Person.class, id);
			session.delete(p);
			
			session.getTransaction().commit();
			System.out.println("commited");
				
			
			//DELETE WITH QUERY
			System.out.println("deleting with query");
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			session.createQuery("delete from Person where id=2")
			.executeUpdate();
			
			session.getTransaction().commit();
			System.out.println("commited");
			
		}
		finally {
			factory.close();
		}
	}

}
