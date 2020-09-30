package humans;

public class HumanTest {

	public static void main(String... args) {
		
		Human josh = new Human("Josh");
		Human jenn = new Human("Jenn");
		Wizard gandalf = new Wizard("Gandalf");
		Ninja walter = new Ninja("Walter");
		Samurai john = new Samurai("John");
		Samurai rob = new Samurai("Rob");
		
		// human
		josh.attack(jenn);
		jenn.attack(josh);
		
		// wizard
		gandalf.fireball(josh);
		gandalf.heal(josh);
		
		// ninja
		walter.steal(josh);
		walter.runAway();
		walter.getHealth();
		josh.getHealth();
		
		// samurai
		john.deathBlow(josh);
		john.meditate();
		
		rob.meditate();
		
		john.howMany();
		
		
		
		
		
		
	}
	
}
