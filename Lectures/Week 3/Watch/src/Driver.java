import watch.Watch;
import watch.Watch3;

public class Driver {
	public static void main(String[] args) {	
		
		Watch watcharray[] = new Watch[1];
		
		watcharray[0] = new Watch3();
		
		for (int ind =0; ind < watcharray.length; ind++) { // variable scope?
			System.out.printf("Watch %d\n", ind); // C-style printf - I'm old skool.
			watcharray[ind].testWatch(500000);
			System.out.println();
		}
		
	}

}
