package counter;

public class Counter {

	public int value = 0;
	
	public void reset() {
		value = 0;
	}
	
	public void decrement() {
		value -=  1;
	}
	
	public void increment() {
		value += 1;
	}
	
	public int getValue() {
		return value;
	}
}