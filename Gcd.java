import java.util.Scanner;
public class Gcd{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		int num1=sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2=sc.nextInt();
		
		int lcm=0,i=1;

		int min=(num1<num2)?num1:num2; 
		do{ 
			if (num1%i==0&&num2%i==0)
			lcm=i;
			i++; 
		}while(i<=min);

		System.out.println("두 수의 최대공약수 : "+lcm);
	}
}


