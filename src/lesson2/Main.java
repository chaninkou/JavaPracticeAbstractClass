package lesson2;

import nba.James;
import nba.Kobe;
import nba.NbaPlayer;

public class Main {

	public static void main(String[] args) {
		NbaPlayer player1 = new Kobe();
		NbaPlayer player2 = new James();
		
		player1.shootingForm();
		player1.shoes();
		player1.moneyFromJob(2);
		
		player2.shootingForm();
		player2.shoes();
		player2.moneyFromJob(2);
		

	}

}
