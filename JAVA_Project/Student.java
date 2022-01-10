package prog4;

public class Student extends Person {
	int stuID;	
	int grade;	
	int ban;	
	
	public void study() {
		System.out.println(name + "(이)가 공부한다.");
	}
	
	public void play() {
		System.out.println(name + "(이)가 논다.");
	}
}
