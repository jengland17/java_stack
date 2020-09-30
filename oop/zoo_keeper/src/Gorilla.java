
public class Gorilla extends Mammal{
	
	public void throwSomething() {
		energyLevel -= 5;
		System.out.println("The Gorilla threw something");
		displayEnergy();
	}
	
	public void eatBananas() {
		energyLevel += 10;
		System.out.println("The Gorilla ate a banana");
		displayEnergy();
	}
	
	public void climb() {
		energyLevel -= 10;
		System.out.println("The Gorilla climbed the tree and is getting sleepy");
		displayEnergy();
	}
	
	
}
