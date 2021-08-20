import java.util.Scanner;
public class Summer1109_4{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		System.out.print("╪Ж ют╥б : ");
		int su=sc.nextInt();

		int squ=su;
		
		for(int i=2; i<=4; i++)
		{
			squ*=su;
			System.out.println(i+"╫б : "+squ);
		}
	}
}