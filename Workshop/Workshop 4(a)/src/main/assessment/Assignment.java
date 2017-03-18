package main.assessment;

public class Assignment extends Assessment {
	public String Title;
	
	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public void constructor(int weight, String title){
		Title = title;
		Weight = weight;
		Description = "Assignent: " + title + ", Weight: " + Integer.toString(Weight) + "%";
	}
}
