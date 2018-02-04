package p1;

public class BaseballCoach implements Coach {
	
	private HappyFortuneService fortune;
	
	public BaseballCoach(HappyFortuneService fortune){
		this.fortune=fortune;
	}

	public String getDailyWorkout() {
		return "Run Baseball field for 10min";
	}

	public String getFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune();
	}

}
