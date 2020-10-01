package phones;

public interface Ringable {
	
	public default String ring() {
		return "Ring ring ring!";  
	}
	
	public default String unlock() {
		return "Your phone is unlocked";
	}
	
	
}
