package trusohamn.Apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import trusohamn.firstSpring.Course;

public class BeanLifeCycleAnnotationApp {

	public static void main(String[] args) {
		// load the Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("applicationContext.xml");
		
		// retrieve bean from the Spring container
		Course myCourse = context.getBean("myCourse", Course.class);
		// call methods on the bean
		System.out.println(myCourse.getDescription());
		
		
		//autowired constructor
		// retrieve bean from the Spring container with default beanid
		Course myCourse2 = context.getBean("chemistry", Course.class);
		// call methods on the bean
		System.out.println(myCourse2.getDescription());
		//autowired with Teacher
		System.out.println(myCourse2.sayHello());
		
		//autowired with setter method
		// retrieve bean from the Spring container with default beanid
		Course myCourse3 = context.getBean("myCourse", Course.class);
		// call methods on the bean
		System.out.println(myCourse3.getDescription());
		//autowired with Teacher
		System.out.println(myCourse3.sayHello());
		
		//autowired with field injection
		// retrieve bean from the Spring container with default beanid
		Course myCourse4 = context.getBean("math", Course.class);
		// call methods on the bean
		System.out.println(myCourse4.getDescription());
		//autowired with Teacher
		System.out.println(myCourse4.sayHello());
		//value injected from the file
		System.out.println(myCourse4.getEmail());
		
		
		// close the context
		context.close();
	
	}

}
