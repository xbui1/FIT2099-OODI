package watch;

public abstract class Watch {

	public abstract void display();
	
	public abstract void tick();

	public void testWatch(int numTicks){
        for (int i = 0; i < numTicks; i++) {
        	display();
            tick();
        }
    };
}