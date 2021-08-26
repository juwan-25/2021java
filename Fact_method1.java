import java.util.Scanner;
public class Fact_method1 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);

		int n,fact=1;
		System.out.print("¼ö ÀÔ·Â : ");
		n=sc.nextInt();

		System.out.print(n+"!=");
		int i=1;
		do{
			fact*=i;
			if(i==n) System.out.print(i);
			else System.out.print(i+"*");
			i++;	
		}while(i<=n);
		System.out.print("="+fact);
	}
}