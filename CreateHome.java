package List2;
//programa3
class Home{
	boolean firstDoor, secondDoor, thirdDoor;
	String color;
	
	void coloredHome(String color) {
		this.color = color;
	}
	int	howManyDoorsAreOpen(boolean firstDoor, boolean secondDoor,boolean thirdDoor) {
		int numberOfOpenDoors=0;
		if (firstDoor==true) {
			numberOfOpenDoors=numberOfOpenDoors+1;
		}
		if (secondDoor==true) {
			numberOfOpenDoors=numberOfOpenDoors+1;
		}
		if (thirdDoor==true) {
			numberOfOpenDoors=numberOfOpenDoors+1;
		}
		
		return numberOfOpenDoors;
	}
}
public class CreateHome {
	public static void main(String[] args) {
		Home home = new Home();
		home.color="Azul";
		home.firstDoor=true;
		home.secondDoor=false;
		home.thirdDoor=true;
		
		showInfoHome(home);
		
		home.color="Rosa";
		home.firstDoor=true;
		home.secondDoor=false;
		home.thirdDoor=false;
		
		showInfoHome(home);
		
	}
	private static void showInfoHome(Home homeInfo) {
		System.out.println("\nSua casa tem color " + homeInfo.color +
				   "\nE tem " + homeInfo.howManyDoorsAreOpen(homeInfo.firstDoor, homeInfo.secondDoor, homeInfo.thirdDoor) +
				   " portas abertas!");
	}
}

