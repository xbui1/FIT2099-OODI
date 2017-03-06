package main;

public class Counter {
	
	private int value = 0;
	
	public Counter() {
		
	}
	
	public void increment() {
		value++;
	}
	
	public void decrement() {
		value--;
	}
	
	public void reset() {
		value = 0;
	}
	
	public int getValue() {
		return value;
	}
}
