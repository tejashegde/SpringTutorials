package annotationexamples;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import p2.Coach;


public class AnnotatiuonExamplesP1 {
	
	/**
	 * Inversion of control examples
	 * 
	 * In this process, the job of creating objects is dsignated to the container
	 */

	@Test
	public void tennisCoach() {

		// load the Spring file configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");
		
		//get the bean
		Coach tennisCoach = context.getBean("tennisCoach",Coach.class);
		
		//print the statement
		System.out.println("Tennis coach workout: "+tennisCoach.getDailyWorkout());
		
		// Close the context
		context.close();
	}

}
