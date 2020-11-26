package ice16;

public class Weapon {
	// Part 1 of ICE16
	
	// 3 properties: String type, int power, and String strikeMessage 
	private String type; 
	private int power; 
	private String strikeMessage; 
	
	// In class Weapon, create a constructor that assigns values to each of these internal private properties of the class in the order above. 
	public Weapon (String type, int power, String strikeMessage) {
		this.type = type; 
		this.power = power; 
		this.strikeMessage = strikeMessage; 
	}
	
	// Method 1
	public int getPower() {
		return power; 
	}
	
	// Method 2 
	public void strike() {
		System.out.println("Weapon of type " + type + " has power " + power);
		System.out.println(strikeMessage);
	}
	
	// Method 3
	public void setPower(int power) {
		this.power = power; 
	}

}
