

import edu.monash.FIT2099.counters.MaxCounter;

public class Watch2 extends Watch{
	
	MaxCounter hours;
	MaxCounter minutes;
	
	public Watch2() {
		
		hours = new MaxCounter(24);
		minutes = new MaxCounter(60);

	}
	
	@Override
	public void display() {
		System.out.println(String.format("%02d", hours.getValue()) + ":" + String.format("%02d", minutes.getValue()));
	}
	
	@Override
	public void tick() {
		
		minutes.increment();
		
		if (minutes.getValue() == 0) {
			
			hours.increment();
			
		}
	}
}
