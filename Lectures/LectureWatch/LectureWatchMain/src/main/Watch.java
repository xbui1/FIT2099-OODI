package main;
import main.Counter;

public class Watch {
	
	public Counter hours;
	public Counter minutes;
    public Watch watch;

	public Watch() {
		// TODO Auto-generated method stub
	}
	
	public void display() {
        StringBuilder hoursStringBuilder = new StringBuilder();
        hoursStringBuilder.append("");
        hoursStringBuilder.append(hours.getValue());
        StringBuilder minutesStringBuilder = new StringBuilder();
        minutesStringBuilder.append("");
        minutesStringBuilder.append(hours.getValue());

		System.out.println(String.format(minutesStringBuilder.toString()) + ":" + minutesStringBuilder.toString());
	}
	
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
	
	public static void main(String[] args) {

	}
	
	public void testWatch(int maxsticks) {
		for (int i = 0; i < maxsticks; i++) {
			if(i > 0){
                watch.display();
            }

			watch.tick();	
		}
		
		
	}
}
