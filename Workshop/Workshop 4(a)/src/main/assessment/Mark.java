package main.assessment;

public class Mark extends Assessment {
	public int Score;
	public String Comment;
	
	public int getScore() {
		return Score;
	}
	public void setScore(int score) {
		Score = score;
	}
	public String getComment() {
		return Comment;
	}
	public void setComment(String comment) {
		Comment = comment;
	}
}
