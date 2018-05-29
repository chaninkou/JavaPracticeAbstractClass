package nba;

public abstract class NbaPlayer {
	public void moneyFromJob(int hours){
		System.out.println("This NBA player will make $" + hours*200.00 + " for each game");
	}
	
	public abstract void shoes();
	
	public abstract void shootingForm();
}
