package counter;

/**
 * Created by Eric Jiang on 13/03/2017.
 */
public class LinkedCounter extends MaxCounter {
    Counter neighbour = new Counter();

    public LinkedCounter(int max, Counter neighbour){
        super(max);
    }

    @Override
    public void increment(){
        super.increment();

        if(this.getValue() == 0){
            neighbour.increment();
        }
    }
}
