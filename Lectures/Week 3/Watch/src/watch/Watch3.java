package watch;
import counter.LinkedCounter;
import counter.MaxCounter;

/**
 * Created by Eric Jiang on 13/03/2017.
 */
public class Watch3 extends Watch {
    MaxCounter hours;
    LinkedCounter minutes;
    LinkedCounter seconds;
    LinkedCounter milliseconds;

    public Watch3(){
        hours = new MaxCounter(24);
        minutes = new LinkedCounter(60, hours);
        seconds = new LinkedCounter(60, minutes);
        milliseconds = new LinkedCounter(1000, seconds);
    }

    public void display(){
        System.out.println(
                String.format("%02d", hours.getValue())
                        + ":"
                        + String.format("%02d", minutes.getValue())
                        + ":"
                        + String.format("%02d", seconds.getValue())
                        + ":"
                        + String.format("%02d", milliseconds.getValue())
                        
        );
    }
    
    public void tick() {
    	milliseconds.increment();
    }
}
