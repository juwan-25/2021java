package Class;

import java.util.Scanner;

class Tri{
	int bottom; //�������
	int height;
//	double area2; ���� ���� ������ ����� �ʿ� ���� ���� ��ȯ��Ŵ
	Tri(){
		System.out.println("�⺻ ������");
	}
	Tri(int b, int h){
		bottom=b;
		height=h;
		System.out.println("�Ű����� �ִ� ������");
	}
	double area(){ //��� �޼���
		return (double)bottom*height/2;
	}
	void print() {
		System.out.println("�غ��� "+bottom+"�̰� ���̰� "+height+"�� �ﰢ���� ���� "+area());
	}
}

public class Tri_Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Tri t1=new Tri((int)(Math.random()*10)+1,(int)(Math.random()*10)+1); //��ü
		//System.out.print("�غ� �Է�>> ");
		//t1.bottom=(int)(Math.random()*10)+1;sc.nextInt();
		//System.out.print("���� �Է�>> ");
		t1.height=(int)(Math.random()*10)+1;
		t1.print();
		
		
		Tri t2=new Tri(); 
		//System.out.print("�غ� �Է�>> ");
		t2.bottom=(int)(Math.random()*10)+1;
		//System.out.print("���� �Է�>> ");
		t2.height=(int)(Math.random()*10)+1;
		t2.print();
	}
}