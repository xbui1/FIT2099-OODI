
import java.util.ArrayList;

public class WatchMain {
	
	public WatchMain() {
		
	}

	public static void main(String[] args) {
		
		ArrayList<Watch> watches = new ArrayList<Watch>();
		watches.add(new Watch3());
		
		for (Watch w : watches) {
			
			w.testWatch(15000);
			System.out.println();
			
		}
	}
}
