/**
 * Created by Eric Jiang on 9/03/2017.
 */
public class MaxCounter extends Counter {
    private int max;

    public MaxCounter(int maxValue) {
        max = maxValue;
    }

    @Override
    public void increment() {
        super.increment();
        if (getValue() == max) {
            reset();
        }
    }
}
