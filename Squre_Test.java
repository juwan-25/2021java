package Class;

import java.util.Scanner;

class Squre{
	int width; //�������
	int length;

	int area(){ //����
		return width*length;
	}
	int perimeter(){
		return 2*(width+length);
	}
	void print() {
		System.out.println("���ΰ� "+width+"�̰� ���ΰ� "+length+"�� �簢���� ���̴� "+area()+"�̰�, �ѷ��� "+perimeter()+"�̴�");
	}
}

public class Squre_Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Squre t1=new Squre(); 
		System.out.print("���� �Է�>> ");
		t1.width=sc.nextInt();
		System.out.print("���� �Է�>> ");
		t1.length=sc.nextInt();
		t1.print();
		
	}
}