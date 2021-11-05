package Class;

import java.util.Scanner;

class Tri{
	int bottom; //멤버변수
	int height;
//	double area2; 굳이 따로 변수를 잡아줄 필요 없이 직접 반환시킴
	Tri(){
		System.out.println("기본 생성자");
	}
	Tri(int b, int h){
		bottom=b;
		height=h;
		System.out.println("매개변수 있는 생성자");
	}
	double area(){ //멤버 메서드
		return (double)bottom*height/2;
	}
	void print() {
		System.out.println("밑변이 "+bottom+"이고 높이가 "+height+"인 삼각형의 넓이 "+area());
	}
}

public class Tri_Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Tri t1=new Tri((int)(Math.random()*10)+1,(int)(Math.random()*10)+1); //객체
		//System.out.print("밑변 입력>> ");
		//t1.bottom=(int)(Math.random()*10)+1;sc.nextInt();
		//System.out.print("높이 입력>> ");
		t1.height=(int)(Math.random()*10)+1;
		t1.print();
		
		
		Tri t2=new Tri(); 
		//System.out.print("밑변 입력>> ");
		t2.bottom=(int)(Math.random()*10)+1;
		//System.out.print("높이 입력>> ");
		t2.height=(int)(Math.random()*10)+1;
		t2.print();
	}
}