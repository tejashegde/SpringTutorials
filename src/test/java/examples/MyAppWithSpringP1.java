package examples;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import p1.Coach;

public class MyAppWithSpringP1 {
	
	/**
	 * Inversion of control examples
	 * 
	 * In this process, the job of creating objects is dsignated to the container
	 */

	@Test
	public void bbCoach() {

		// load the Spring file configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		Coach baseBallCoach = context.getBean("baseballCoach", Coach.class);

		// Call the method
		System.out.println("THIS IS SETTER INJECTION!!");
		System.out.println("Baseball coach says: " + baseBallCoach.getDailyWorkout());
		System.out.println("BB: Your fortune for the day: " + baseBallCoach.getFortune());
		
		// Close the context
		context.close();
	}

	@Test
	public void printCricketCoach() {
		
	//load Spring applicationContext.xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	// retrieve the bean from the container
	   Coach cricketCoach = context.getBean("cricketCoach",Coach.class);
	 
	 //Call the method
	  System.out.println("THIS IS SETTER INJECTION!!"); 
	  System.out.println("Cricket coach says: "+cricketCoach.getDailyWorkout());
	  System.out.println("Cricket coach says: "+cricketCoach.getFortune());
	  
	  context.close();

	}
	
	@Test
	public void printFootballCoach() {
		ClassPathXmlApplicationContext content = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach footballCoach = content.getBean("footBallCoach", Coach.class);
		
		System.out.println("THIS IS SETTER INJECTION!!");
		System.out.println("Football coach says: "+footballCoach.getDailyWorkout());
		System.out.println("Football coach says: "+footballCoach.getFortune());
	}

}
