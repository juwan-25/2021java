package prog6_mvc;

import java.util.ArrayList;
import java.util.Scanner;

public class controller {

	public static void main(String[] args) {
		ArrayList<Student> studentArrList = new ArrayList<Student>();
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2= new Scanner(System.in);
		
		String[] sub = {"국어", "영어", "수학", "과학", "역사"};
		int[] score = new int[sub.length];
		
		while (true) {
			System.out.println("* 학생정보를 입력해주세요.");
			System.out.print("성명 : ");
			String name = sc1.nextLine();
			System.out.print("학번 : ");
			int stuId = sc2.nextInt();
			
			System.out.println("* 학생성적을 입력해주세요.");
			for(int i=0; i<sub.length; i++) {
				System.out.print(sub[i]+" : ");
				score[i] = sc2.nextInt();
			}
			Student s = new Student(name, stuId, score[0], score[1], score[2], score[3], score[4]);
			studentArrList.add(s);
			
			System.out.print("다음 학생정보를 계속 입력하시겠습니까?(y/n)");
			String ans = sc1.nextLine();
			if(ans.equals("n")||ans.equals("no")) break;
		}
		
		ScoreView view = new ScoreView(studentArrList);
		view.print();
		
		sc1.close();
		sc2.close();
	}

}
