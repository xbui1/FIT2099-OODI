package main.assessment;

public abstract class Assessment {
	public int Weight;
	public int Mark;
	public String Description;
	
	public int getWeight() {
		return Weight;
	}
	public void setWeight(int weight) {
		Weight = weight;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getMark() {
		return Mark;
	}
	
	public void setMark(int mark) {
		Mark = mark;
	}
}
