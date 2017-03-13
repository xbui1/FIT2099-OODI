package counter;

import counter.Counter;

public class MaxCounter extends Counter {
	private int max;
	
	public MaxCounter(int maxValue) {
		max=maxValue;
	}
	
	@Override
	public void increment() {
		super.increment();
		if (super.getValue() == max) {
			super.reset();
		}
	}
}
