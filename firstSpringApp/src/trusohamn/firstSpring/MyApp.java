package trusohamn.firstSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// load the Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("applicationContext.xml");
		// retrieve bean from the Spring container
		Course myCourse = context.getBean("myCourse", Course.class);
		// call methos on the bean
		System.out.println(myCourse.getDescription());
		// close the context
		context.close();
	
	}

}
