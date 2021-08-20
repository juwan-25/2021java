import java.util.Scanner;
public class Summer1109_5 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Ãþ ¼ö : ");
		int flo=sc.nextInt();
		
		for(int i=1; i<=flo; i++){
			for(int j=1; j<=flo-i; j++) 
				System.out.print("  ");
			for(int j=1; j<=2*i-1; j++)
				System.out.print("* ");
			System.out.println(" ");
		}
	}
}