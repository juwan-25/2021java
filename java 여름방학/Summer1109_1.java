import java.util.Scanner;
public class Summer1109_1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("¼ö ÀÔ·Â : ");
		int su=sc.nextInt();
		
		System.out.println("Á¦°ö : "+su*su);
		System.out.println("¼¼Á¦°ö : "+su*su*su);
		System.out.println("³×Á¦°ö : "+su*su*su*su);
	}
}