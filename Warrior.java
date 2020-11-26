package ice16;

public class Warrior {
	// Part 2 of ICE16
	
	// 4 properties: int age, String name, int expLevel, Weapon weapon 
	private int age; 
	private String name; 
	private int expLevel; 
	private Weapon weapon; 
	
	// Create a constructor that assigns each value to the property 
	public Warrior(int age, String name, int expLevel, Weapon weapon) {
		this.age = age; 
		this.name = name; 
		this.expLevel = expLevel; 
		this.weapon = weapon; 
	}
	
	// Method 1 
	public void attack() {
		System.out.println("Warrior, " + name + " with experience level " + expLevel + " attacks!");
		// Call the strike method from the weapon class
		this.weapon.strike(); 
	} 
	
	
	// Method 2 
	public void assignWeapon(Weapon weapon) {
		this.weapon = weapon; 
	} 

}
