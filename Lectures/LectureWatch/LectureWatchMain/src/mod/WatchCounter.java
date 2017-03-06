package mod;
import mod.WatchStructure;

public class WatchCounter {
    private WatchStructure watchStructure;

    private int seconds = watchStructure.getSeconds();
    private int minutes = watchStructure.getMinutes();
    private int hours = watchStructure.getHours();


    public void increment(){
        watchStructure.setSeconds(seconds++);
        if(seconds == 60){
            watchStructure.setMinutes(minutes++);
            if(minutes == 60){
                watchStructure.setHours(hours++);
            }
        }
    }

    public void reset(){
        watchStructure.setHours(0);
        watchStructure.setMinutes(0);
        watchStructure.setSeconds(0);
    }
}
