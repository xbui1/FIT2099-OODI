package edu.monash.FIT2099.counters;

public class MaxCounter extends Counter{
	
	private int max;
	
	public MaxCounter(int maxVal, int width) {
		super(width);
		max = maxVal;
	
	}
	
	@Override
	public void increment() {
		
		super.increment();
		if (getValue() >= max) {
			
			reset();
			
		}
		
		
	}
	
}
