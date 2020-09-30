
public class Bat extends Mammal{

	public Bat() {
		this.energyLevel = 300;
	}
	
	public void fly() {
		energyLevel -= 50;
		System.out.println("Flying...");
		displayEnergy();
	}
	
	public void eatHumans() {
		energyLevel += 25;
		System.out.println("Screams of humans");
		displayEnergy();
	}
	
	public void attackTown() {
		energyLevel -= 100;
		System.out.println("Screeeech!");
		displayEnergy();
	}
	
}
