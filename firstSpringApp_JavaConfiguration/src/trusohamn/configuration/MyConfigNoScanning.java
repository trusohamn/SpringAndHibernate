package trusohamn.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import trusohamn.dependency.Teacher;
import trusohamn.dependency.TeacherNoAnnotation;
import trusohamn.firstSpring.Course;
import trusohamn.firstSpring.CourseNotAnnotated;

@Configuration
@ComponentScan("trusohamn")
public class MyConfigNoScanning {
	//dependency bean
	@Bean 
	public Teacher myTeacherBeanId() {
		return new TeacherNoAnnotation();
	}
	//define bean and inject dependency
	@Bean 
	public Course myCourseBeanId() {
		return new CourseNotAnnotated(myTeacherBeanId());
	}

}
