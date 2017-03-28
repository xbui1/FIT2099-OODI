package main.assessment;

public class Exam extends Assessment{
	public int Duration;
	
	public int getDuration() {
		return Duration;
	}

	public void setDuration(int duration) {
		Duration = duration;
	}

	public void constructor(int weight, int duration){
		if(duration < 30){
			throw new RuntimeException("Duration of Exams cannot be less than 30 minutes");
		}
		Duration = duration;
		Weight = weight;
		Description = "Exam Duration: " + Integer.toString(Duration) + " minutes, Weight: " + Integer.toString(Weight) + "%";
	}
}
