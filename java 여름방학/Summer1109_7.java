import java.util.Scanner;
public class Summer1109_7{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("�� �� �Է� : ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();

		int mul=num1*num2;
		System.out.println("�� : "+mul);

		double avg=(num1+num2)/2.0;
		System.out.println("��� : "+avg);
		
		int lcm=0;

		int min=(num1<num2)?num1:num2; 
		for (int i=1; i<=min; i++) { 
			if (num1%i==0&&num2%i==0)
			lcm=i; 
		}
		System.out.println("�ִ����� : "+lcm);
		System.out.println("�ּҰ���� : "+mul/lcm);
	}
}


