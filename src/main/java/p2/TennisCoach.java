package p2;

import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach {
	
	public String getDailyWorkout() {
		return "Pratice your daily shots!!";

	}

}
