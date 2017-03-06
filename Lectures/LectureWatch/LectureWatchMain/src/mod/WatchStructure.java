package mod;


public class WatchStructure {

    public int Hours;
    public int Minutes;
    public int Seconds;

    public int getHours() {
        return Hours;
    }

    public void setHours(int hours) {
        Hours = hours;
    }

    public int getMinutes() {
        return Minutes;
    }

    public void setMinutes(int minutes) {
        Minutes = minutes;
    }

    public int getSeconds() {
        return Seconds;
    }

    public void setSeconds(int seconds) {
        Seconds = seconds;
    }

    public void tick(){
        this.increment();
    }

    public void increment(){
        Seconds++;
        if(Seconds == 60){
            Minutes++;
            if(Minutes == 60){
                Hours++;
                if(Hours == 24){
                    this.reset(); //reset after 24 hours
                }
            }
        }
    }

    public void reset(){
        Seconds = 0;
        Minutes = 0;
        Hours = 0;
    }
}
