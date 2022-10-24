package List2;
//programa2
class Door{
	boolean doorIsOpen;
	double doorWidth, doorHeight, doorDepth;
	String doorColor;
	
	void openDoor() {
		this.doorIsOpen = true;
	}
	void closeDoor() {
		this.doorIsOpen = false;
	}
	void sizeDoor(double doorWidth, double doorHeight, double doorDepth) {
		this.doorWidth = doorWidth;
		this.doorHeight = doorHeight;
		this.doorDepth = doorDepth;
	}
	void coloredDoor(String color) {
		this.doorColor = color;
	}
	boolean	isOpen() {
		return this.doorIsOpen;
	}
}
public class CreateDoor {
	public static void main(String[] args) {
		Door door = new Door();
		door.doorIsOpen=false;
		door.doorWidth=0.6;
		door.doorHeight=1.2;
		door.doorDepth=0.15;
		door.doorColor="Preta";
		
		showInfoDoor(door);
		
		door.openDoor();
		door.coloredDoor("Rosa");
		door.sizeDoor(1, 3, 0.15);
		showInfoDoor(door);		
	}
	private static void showInfoDoor(Door doorInfo) {
		String doorStatus;
		if (doorInfo.isOpen() == true) {
			doorStatus = "Sim está aberta!";
		}
		else {
			doorStatus = "Não está aberta!";
		}
		
		System.out.println("\n"+doorStatus + 
				   "\nSua cor é " + doorInfo.doorColor +
				   "\nSua Dimensão é " + doorInfo.doorWidth + " X "+
				   doorInfo.doorHeight + " X "+ doorInfo.doorDepth);
	}
}

