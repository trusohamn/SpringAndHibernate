package Apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import trusohamn.firstSpring.Course;

public class MyApp {

	public static void main(String[] args) {
		// load the Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("applicationContext.xml");
		// retrieve bean from the Spring container
		Course myCourse = context.getBean("myCourse", Course.class);
		// call methods on the bean
		System.out.println(myCourse.getDescription());
		System.out.println(myCourse.sayHello());
		
		
		// setter injection
		Course myCourse2 = context.getBean("myCourse2", Course.class);
		// call methods on the bean
		System.out.println(myCourse2.getDescription());
		System.out.println(myCourse2.sayHello());
		System.out.println(myCourse2.getEmail());
		
		//injection from properties file
		Course myCourse3 = context.getBean("myCourse3", Course.class);
		// call methods on the bean
		System.out.println(myCourse3.getDescription());
		System.out.println(myCourse3.sayHello());
		System.out.println(myCourse3.getEmail());
		
		// close the context
		context.close();
	
	}

}
