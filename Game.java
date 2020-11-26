package ice16;

public class Game {

	public static void main(String[] args) {
		// Part 3 of ICE16
		
		// List of weapons
		Weapon mean = new Weapon("Mean Words", 1, "Mean words cause very little damage"); 
		Weapon bat = new Weapon("Baseball Bat", 10, "Some properties get destroyed"); 
		Weapon gun = new Weapon("Handgun", 100, "Stronger than a baseball bat"); 
		Weapon bazooka = new Weapon("Bazooka", 200, "Major destruction"); 
		Weapon laChancla = new Weapon("La Chancla", 4000, "Total annihilation"); 
		
		// Warriors 
		Warrior w1 = new Warrior(28, "Skeletor", 20, mean); 
		Warrior w2 = new Warrior(19, "Striker", 18, bat); 
		
		// Attack method onto the warriors
		w1.attack(); 
		w2.attack(); 
		
		// Call assignWeapon on w1 and pass gun to it and then call attack() on w1
		w1.assignWeapon(gun);
		w1.attack(); 
		
		// Call assignWeapon on w2 and pass bazooka to it and then call attack() on w2
		w2.assignWeapon(bazooka);
		w2.attack(); 
		
		// Call assignWeapon on w1 and pass laChancla to it and then call attack() on w1 
		w2.assignWeapon(laChancla); 
		w1.attack(); 

	}

}
 
// Output: Warrior, Skeletor with experience level 20 attacks!
// Weapon of type Mean Words has power 1
// Mean words cause very little damage
// Warrior, Striker with experience level 18 attacks!
// Weapon of type Baseball Bat has power 10
// Some properties get destroyed
// Warrior, Skeletor with experience level 20 attacks!
// Weapon of type Handgun has power 100
// Stronger than a baseball bat
// Warrior, Striker with experience level 18 attacks!
// Weapon of type Bazooka has power 200
// Major destruction
// Warrior, Skeletor with experience level 20 attacks!
// Weapon of type Handgun has power 100
// Stronger than a baseball bat