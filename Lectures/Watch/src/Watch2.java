public class Watch2 implements Watch {

    MaxCounter minutes;
    MaxCounter hours;

    public Watch2() {

        hours = new MaxCounter(24);
        minutes = new MaxCounter(60);
    }

    public void tick() {
        minutes.increment();
        if (minutes.getValue() == 0) {
            hours.increment();
        }
    }

    public void display() {
        System.out.println(
                String.format("%02d", hours.getValue())
                        + ":"
                        + String.format("%02d", minutes.getValue())
        );
    }

    public void testWatch(int numTicks) {
        for (int i = 0; i < numTicks; i++) {
            display();
            tick();
        }
    }

}
