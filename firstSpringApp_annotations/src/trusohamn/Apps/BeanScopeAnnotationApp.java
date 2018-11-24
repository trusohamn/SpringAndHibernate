package trusohamn.Apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import trusohamn.firstSpring.Course;

public class BeanScopeAnnotationApp {

	public static void main(String[] args) {
		// load the Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("applicationContext.xml");
		
		// retrieve bean from the Spring container
		Course myCourse = context.getBean("myCourse", Course.class);
		System.out.println(myCourse.sayHello());
		context.close();
	}

}
