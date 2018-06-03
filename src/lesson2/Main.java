package lesson2;

import nba.James;
import nba.Kobe;
import nba.NbaPlayer;

public class Main {

	public static void main(String[] args) {
		NbaPlayer player1 = new Kobe();
		NbaPlayer player2 = new James();
		
		// Creating a new object
		Kobe player3 = new Kobe();
		
		// Kobe could get method from the superclass Kobe inheritance from NbaPlayer
		player3.moneyFromJob(3);
		
		// This is already from the object
		player3.shoes();
		
		player1.shootingForm();
		player1.shoes();
		player1.moneyFromJob(2);
		
		player2.shootingForm();
		player2.shoes();
		player2.moneyFromJob(2);
		

	}

}
