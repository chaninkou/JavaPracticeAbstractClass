package nba;

// subclass always come first and then superclass come after which is (extends NbaPlayer)
public class Kobe extends NbaPlayer {

	@Override
	public void shoes() {
		System.out.println("Kobe's Shoes 11");

	}

	@Override
	public void shootingForm() {
		System.out.println("Could be able to shoot from anywhere");
	}

}
