import java.util.Scanner;
public class divisor_1109{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int yak, num;
		System.out.print("����� ���� �� �Է� : ");
		num=sc.nextInt();
		
		System.out.print(num+"�� ��� : ");
		for(int i=1; i<=num; i++)
			if(num%i==0) System.out.print(i+" ");
		System.out.println();
	}
}