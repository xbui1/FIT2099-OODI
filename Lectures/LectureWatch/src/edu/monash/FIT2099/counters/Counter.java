package edu.monash.FIT2099.counters;

public class Counter {
	
	private int value = 0;
	public String formatString;
	
	public Counter(int width) {
		setWidth(width);
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
	
	public String toString(){
		return String.format(formatString, value);
	}
	
	public void setWidth(int width){
		formatString = "%0" + width +"d";
	}
}
