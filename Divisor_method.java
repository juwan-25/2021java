import java.util.Scanner;
public class Divisor_method {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);

		System.out.print("수 입력 : ");
		int n=sc.nextInt();

		System.out.print(n+"의 약수 : ");
		int i=1;
		do{
			if (n%i==0) System.out.print(i+" ");
			i++;	
		}while(i<=n);
	}
}