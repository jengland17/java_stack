package phones;

	
public class IPhone extends Phone implements Ringable {
	
	
	    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
	        super(versionNumber, batteryPercentage, carrier, ringTone);
	    }
	    
	    
	    @Override
	    public String ring() {
	        String ringing = getRingTone();
	        return ringing; 
	    }
	    
	    
	    @Override
	    public String unlock() {
	        return "Unlocked your phone via facial recognition";
	    }
	    
	    
	    @Override
	    public void displayInfo() {
	        System.out.println("IPhone " + getVersionNumber() + " from " + getCarrier() + " has " + getBatteryPercentage() + "% battery.");        
	    }

}
