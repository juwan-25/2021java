import java.util.Scanner;
public class Fact_method {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);

		int n,sum=1;
		System.out.print("╪Ж ют╥б : ");
		n=sc.nextInt();

		System.out.print(n+"!=");
		for(int i=1; i<=n; i++){
			sum*=i;
			if(i==n) System.out.print(i);
			else System.out.print(i+"*");
		}
		System.out.print("="+sum);
	}
}