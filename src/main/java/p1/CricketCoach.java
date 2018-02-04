package p1;

public class CricketCoach implements Coach {
	
	
	public CricketCoach(CricketFortune cricketFortune) {
		super();
		this.cricketFortune = cricketFortune;
	}

	private CricketFortune cricketFortune;
	
	

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run cricket field for 10 mins";
	}

	public String getFortune() {
		// TODO Auto-generated method stub
		return cricketFortune.getFortune();
	}
	
	//init & destroy methods in a bean must always be public void
	public void initMethod() {
		System.out.println("This is from the init methiod!!");
	}
	
	public void destroyMethod() {
		System.out.println("This is from the destroy method!!");
	}

}
