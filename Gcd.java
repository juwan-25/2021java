import java.util.Scanner;
public class Gcd{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("ù��° �� �Է� : ");
		int num1=sc.nextInt();
		System.out.print("�ι�° �� �Է� : ");
		int num2=sc.nextInt();
		
		int lcm=0,i=1;

		int min=(num1<num2)?num1:num2; 
		do{ 
			if (num1%i==0&&num2%i==0)
			lcm=i;
			i++; 
		}while(i<=min);

		System.out.println("�� ���� �ִ����� : "+lcm);
	}
}


