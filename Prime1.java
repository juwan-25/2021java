import java.util.Scanner;
public class Prime1 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);

		System.out.print("�� �Է� : ");
		int n=sc.nextInt();
		
		if(pri(n)==2)
			System.out.println(n+"��(��) �Ҽ��̴�.");
		else
			System.out.println(n+"��(��) �Ҽ��� �ƴϴ�.");		
	}
	static int pri(int n){
		int i=1,cnt=0;
		do{
			if(n%i==0) cnt++;
			i++;
		}while(i<=n);
		return cnt;
	}
}