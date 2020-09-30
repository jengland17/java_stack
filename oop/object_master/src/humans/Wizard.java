package humans;

public class Wizard extends Human {
	
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
	}
	
	public Wizard(String name) {
		this.health = 50;
		this.intelligence = 8;
		this.name = name;
	}
	
	public void heal(Human human) {
		human.setHealth(human.getHealth() + this.intelligence);
		System.out.println(human.getName() + " You have been healed! Health increased by " + this.intelligence + "!");
		System.out.println("Thanks to " + this.getName() + ".");
	}
	
	public void fireball(Human human) {
		human.setHealth(human.getHealth() - (this.intelligence * 3));
		System.out.println(human.getName() + " that is gonna leave a mark! You lost " + (this.intelligence * 3) + " health...");
		System.out.println(this.getName() + " hit you with a fireball!");
	}

}
