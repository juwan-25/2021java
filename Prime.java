import java.util.Scanner;
public class Prime {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);

		int n,a=0;
		System.out.print("�� �Է� : ");
		n=sc.nextInt();


		for(int i=1; i<=n; i++)
			if(n%i==0) a+=i;
		
		if(n==1)
			System.out.println(n+"��(��) �Ҽ��� �ƴϴ�.");
		else if(a>n+1)
			System.out.println(n+"��(��) �Ҽ��� �ƴϴ�.");
		else
			System.out.println(n+"��(��) �Ҽ��̴�.");	

		for(int i=1; i<=n; i++)
			if(n%i==0) a++;
		
		if(a==2)
			System.out.println(n+"��(��) �Ҽ��̴�.");
		else
			System.out.println(n+"��(��) �Ҽ��� �ƴϴ�.");		
	}
}