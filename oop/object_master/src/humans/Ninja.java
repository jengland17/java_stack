package humans;

public class Ninja extends Human{
	
	public Ninja() {
		this.stealth = 10;
	}
	
	public Ninja(String name) {
		this.stealth = 10;
		this.name = name;
	}
	
	
	public void steal(Human human) {
		
		human.setHealth(human.getHealth() - this.stealth);
		this.setHealth(this.getHealth() + this.stealth);
		System.out.println("Sneaky ninja took your lifeforce!");
		System.out.println(human.getName() + " you took " + this.stealth + " damage from an unknown entity");
		
	}
	
	public void runAway() {
		this.setHealth(this.getHealth() - 10);
	}

}
