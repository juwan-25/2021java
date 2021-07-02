import java.util.Scanner;
public class star_1109{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int N;
		System.out.print("input N -> ");
		N=sc.nextInt();
		
		for(int i=1; i<=N; i++){
			for(int j=1; j<=i-1; j++)
				System.out.print("*");
			for(int j=1; j<=1; j++)
				System.out.print((char)('A'+(i-1)));
			for(int j=1; j<=N-i; j++)
				System.out.print("*");
			System.out.println();
		}
			

	}
}