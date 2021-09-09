package Array;

import java.util.Scanner;
public class score {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int kor, eng, math, java, add;
		double arg;

		
		System.out.print("학번 : ");
		String num=scan.next();
		
		System.out.print("이름 : ");
		String name=scan.next();
		
		while(true) {
			System.out.print("국어 점수 : ");
			kor=scan.nextInt();
			if(kor>=0&&kor<=100) break;
			else System.out.println("0~100사이 점수로 다시 입력하세요.");
		}
		while(true) {
			System.out.print("영어 점수 : ");
			eng=scan.nextInt();
			if(eng>=0&&eng<=100) break;
			else System.out.println("0~100사이 점수로 다시 입력하세요.");
		}
		while(true) {
			System.out.print("수학 점수 : ");
			math=scan.nextInt();
			if(math>=0&&math<=100) break;
			else System.out.println("0~100사이 점수로 다시 입력하세요.");
		}
		while(true) {
			System.out.print("자바 점수 : ");
			java=scan.nextInt();
			if(java>=0&&java<=100) break;
			else System.out.println("0~100사이 점수로 다시 입력하세요.");
		}
		
		add=kor+eng+math+java;
		arg=(double)add/4;
		
		System.out.println();
		System.out.println("합계 : "+add);
		System.out.println("평균 : "+arg);
		//평균 A(90이상) B(80이상) C(70이상) D(60이상) E(나머지)
		System.out.print("평점 : ");
		switch((int)(arg/10)) {
			case 10 :
			case 9 : System.out.println("A"); break;
			case 8 : System.out.println("B"); break;
			case 7 : System.out.println("C"); break;
			case 6 : System.out.println("D"); break;
			default : System.out.println("E");

		}
		

	}

}
