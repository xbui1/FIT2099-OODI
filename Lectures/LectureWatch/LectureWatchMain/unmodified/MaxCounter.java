public class MaxCounter extends main.Counter{
    private int max;

    public MaxCounter() {

    }

    @Override
    public void increment() {
        super.increment();
        if(getValue() == max){
            reset();
        }

    }
}
