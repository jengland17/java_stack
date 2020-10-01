package phones;

public class Galaxy extends Phone implements Ringable {
	
public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
	
	
    @Override
    public String ring() {
        String ringing = getRingTone();
        return ringing;
    }
    
    
    @Override
    public String unlock() {
        return "Unlocked your phone via fingerprint";
    }
    
    
    @Override
    public void displayInfo() {
        System.out.println("Galaxy " + getVersionNumber() + " from " + getCarrier() + " has " + getBatteryPercentage() + "% battery.");        
    }

}
