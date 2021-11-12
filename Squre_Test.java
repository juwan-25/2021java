package Class;

import java.util.Scanner;

class Squre{
	int width; //멤버변수
	int length;

	int area(){ //넓이
		return width*length;
	}
	int perimeter(){
		return 2*(width+length);
	}
	void print() {
		System.out.println("가로가 "+width+"이고 세로가 "+length+"인 사각형의 넓이는 "+area()+"이고, 둘레는 "+perimeter()+"이다");
	}
}

public class Squre_Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Squre t1=new Squre(); 
		System.out.print("가로 입력>> ");
		t1.width=sc.nextInt();
		System.out.print("세로 입력>> ");
		t1.length=sc.nextInt();
		t1.print();
		
	}
}