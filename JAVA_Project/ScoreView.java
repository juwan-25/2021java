package prog6_mvc;

import java.util.ArrayList;

public class ScoreView {

	private ArrayList<Student> studentArrList;

	public ScoreView(ArrayList<Student> studentArrList) {
		this.studentArrList = studentArrList;
	}
	
	public void print() {
		System.out.println("============ MVC �𵨸��� ������� �� ���� ���α׷� ============");
		
		for(int i=0; i<studentArrList.size(); i++) {
			Student s = studentArrList.get(i);
			System.out.printf("* ���� : %s �й� : %d ���� : %d ���� : %d \n");
		}
			
	}
	
}
