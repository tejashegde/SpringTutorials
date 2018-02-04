package examples;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import p1.Coach;

public class MyAppWithSpringScopes {
	
	/**
	 * Inversion of control examples
	 * 
	 * In this process, the job of creating objects is dsignated to the container
	 */

	@Test
	public void bbCoachSingleTon() {

		// load the Spring file configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextScopes.xml");

		// retrieve bean from spring container
		Coach baseBallCoach = context.getBean("baseballCoach", Coach.class);
		
		Coach baseBallCoach2 = context.getBean("baseballCoach", Coach.class);
		
		//printing the context when the scope is singleton	
		System.out.println(baseBallCoach);
		System.out.println(baseBallCoach2);
		
		// Close the context
		context.close();
	}
	
	@Test
	public void cricketCoachPrototype() {

		
	//load Spring applicationContext.xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextScopes.xml");
		
	// retrieve the bean from the container
	   Coach cricketCoach = context.getBean("cricketCoach",Coach.class);
	 
	// retrieve the bean from the container
	   Coach cricketCoach2 = context.getBean("cricketCoach",Coach.class);
	   
		//printing the context when the scope is prototype	
		System.out.println(cricketCoach);
		System.out.println(cricketCoach2);
	  
	  context.close();

	}
}
