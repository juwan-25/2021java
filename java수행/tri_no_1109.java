import java.util.Scanner;
public class tri_no_1109{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		System.out.print("���� �Է��ϼ���. >> ");
		int H=sc.nextInt();
		
		for(int i=H; i>=0; i--){
			for(int j=i; j>=0; j--) 
				System.out.print(j*i+"   ");
			System.out.println();
		}
	}
}