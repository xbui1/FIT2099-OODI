
import edu.monash.FIT2099.counters.Counter;

public class Watch1 extends Watch{
	
	Counter hours;
	Counter minutes;

	public Watch1() {
		
		hours = new Counter();
		minutes = new Counter();
		
	}
	
	@Override
	public void display() {
		
		System.out.println(String.format("%02d", hours.getValue()) + ":" + String.format("%02d", minutes.getValue()));
		
	}
	
	@Override
	public void tick() {
		minutes.increment();
		if (minutes.getValue() == 60) {
			hours.increment();
			minutes.reset();
		}
		
		if (hours.getValue() == 24) {
			hours.reset();
		}
	}
}
