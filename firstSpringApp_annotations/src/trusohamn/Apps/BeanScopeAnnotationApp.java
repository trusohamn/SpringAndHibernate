package trusohamn.Apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import trusohamn.firstSpring.Course;

public class BeanScopeAnnotationApp {

	public static void main(String[] args) {
		// load the Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("applicationContext.xml");
		
		//SINGLETON
		// retrieve bean from the Spring container
		Course myCourse = context.getBean("math", Course.class);
		Course myCourse2 = context.getBean("math", Course.class);
		//are those the same baeans
		boolean theSame = (myCourse == myCourse2);
		System.out.println( "poiting to: " + (theSame ? "the same object" : "different object"));
		System.out.println( "location of myCourse: " + myCourse);
		System.out.println( "location of myCourse2: " + myCourse2);
		
		//PROTOTYPE
		// retrieve bean from the Spring container
		Course myCourse3 = context.getBean("chemistry", Course.class);
		Course myCourse4 = context.getBean("chemistry", Course.class);
		//are those the same baeans
		boolean theSame2 = (myCourse3 == myCourse4);
		System.out.println( "poiting to: " + (theSame2 ? "the same object" : "different object"));
		System.out.println( "location of myCourse3: " + myCourse3);
		System.out.println( "location of myCourse4: " + myCourse4);
		
		// close the context
		context.close();
	}

}
