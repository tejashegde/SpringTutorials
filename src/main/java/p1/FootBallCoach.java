package p1;

public class FootBallCoach implements Coach {
	
	private FootBallFortune fortune;
	

	public FootBallCoach() {
		System.out.println("Inside football coach constructor!!");
	}

	public String getDailyWorkout() {
		return "Do squats to strengthen legs!!";
	}
	
	
	public void setFortuneService(FootBallFortune fortune) {
		System.out.println("Inside football coach setter method!!");
		this.fortune = fortune;
	}


	public String getFortune() {
		return fortune.getFortune();
	}

}
