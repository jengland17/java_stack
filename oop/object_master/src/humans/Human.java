package humans;

public class Human {
	
	protected String name = "";
	protected Integer strength = 3;
	protected Integer stealth = 3;
	protected Integer intelligence = 3;
	protected Integer health = 100;
	
	// Constructors
	
	public Human() {
		
	}
	
	public Human(String name) {
		this.name = name;
	}

	
	// Setters and getters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStrength() {
		return strength;
	}

	public void setStrength(Integer strength) {
		this.strength = strength;
	}

	public Integer getStealth() {
		return stealth;
	}

	public void setStealth(Integer stealth) {
		this.stealth = stealth;
	}

	public Integer getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence; 
	}

	public Integer getHealth() {
		System.out.println(this.getName() + " You have this much health " + health);
		return health;
	}

	public void setHealth(Integer health) {
		this.health = health;
	}
	
	
	public void attack(Human human) {
		human.setHealth(human.getHealth()-strength);
		System.out.println(this.getName() + " punched " + human.getName() + " for " + this.getStrength() + " damage!");
	}
	
	
	
}
