package Apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import trusohamn.firstSpring.Course;

public class BeanLifeCycleApp {

	public static void main(String[] args) {
		// load the Spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext ("beanLifeCycle_applicationContext.xml");
		
		//SINGLETON
		System.out.println("SINGLETON");
		// retrieve bean from the Spring container
		Course myCourse = context.getBean("myCourse", Course.class);
		System.out.println(myCourse.sayHello());
	
		// close the context
		context.close();
		
		
		//PROTOTYPE doesnt call destroy method! But it apparently does--
		System.out.println("PROTOTYPE");
		ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext ("beanLifeCycle_applicationContext.xml");
		Course myCourse3 = context2.getBean("myCourse2", Course.class);
		System.out.println(myCourse3.sayHello());
		context2.close();
	}

}
