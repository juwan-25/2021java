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
			System.out.printf("* ���� : %s �й� : %d ���� : %d ���� : %d ���� : %d ���� : %d ���� : %d �հ� : %d ���  : %.2f\n",
					s.getName(),s.getStuId(),s.getKor(),s.getEng(),s.getMath(),s.getScience(),s.getHistory(),
					calcSum(s), calcAvg(calcSum(s)));
		}
			
	}
	
	public int calcSum(Student s) {
		int sum=s.getKor()+s.getEng()+s.getMath()+s.getScience()+s.getHistory();
		return sum;

	}
	public double calcAvg(int sum) {
		double avg = (double)sum/5;
		return avg;

	}
	
}
