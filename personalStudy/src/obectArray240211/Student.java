package obectArray240211;

public class Student {
	private String name;
	private String subject;
	private int score;
	public Student() {
		super();
	}
	public Student(String name, String subject, int score) {
		super();
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	
	public String inform() {
		return "이름 : " + this.name + " / " + "과목 : " + this.subject + " / " + " 점수 : " + this.score;
	}
	
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getSubject() {
		return subject;
	}
	public final void setSubject(String subject) {
		this.subject = subject;
	}
	public final int getScore() {
		return score;
	}
	public final void setScore(int score) {
		this.score = score;
	}
	
	
}
