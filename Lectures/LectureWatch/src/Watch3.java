
import edu.monash.FIT2099.counters.LinkedCounter;
import edu.monash.FIT2099.counters.MaxCounter;


public class Watch3 extends Watch{
	
	LinkedCounter seconds;
	LinkedCounter minutes;
	MaxCounter hours;
	
	public Watch3() {
		
		hours = new MaxCounter(24,2);
		minutes = new LinkedCounter(60, 2, hours);
		seconds = new LinkedCounter(60, 2, minutes);
		
	}
	
	@Override
	public void display() {
		
		System.out.println(String.format(hours + ":" + minutes + ":" + seconds));
	
	}
	
	@Override
	public void testWatch(int maxsticks) {
		
		Watch3 watch = new Watch3();
		hours = new MaxCounter(24, 2);
		minutes = new LinkedCounter(60, 2, hours);
		seconds = new LinkedCounter(60, 2, minutes);
		
		for (int i = 0; i < maxsticks; i++) {
			
			watch.display();
			watch.tick();	
			
		}
	
	}
		
	@Override
	public void tick() {
		
		seconds.increment();
		
	}
	
	
}
