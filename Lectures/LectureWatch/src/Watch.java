
public abstract class Watch {
	
	public abstract void display();
	
	public abstract void tick();
	
	public void testWatch(int maxticks) {
	
		for (int i = 0; i < maxticks; i++) {
			
			display();
			tick();
			
		}
	}
}
