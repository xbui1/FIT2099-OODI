package edu.monash.FIT2099.counters;

public class LinkedCounter extends MaxCounter{
	
	Counter neighbour;
	
	public LinkedCounter(int max, int width, Counter neighbour) {
		super(max, width);
		this.neighbour = neighbour;	
	}
	
	@Override
	public void increment() {
		
		super.increment();
		
		if (this.getValue() == 0) {
			
			neighbour.increment();
			
		}
		
	}

}
