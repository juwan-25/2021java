import java.util.Scanner;
public class Divisor_method {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);

		System.out.print("�� �Է� : ");
		int n=sc.nextInt();

		System.out.print(n+"�� ��� : ");
		int i=1;
		do{
			if (n%i==0) System.out.print(i+" ");
			i++;	
		}while(i<=n);
	}
}