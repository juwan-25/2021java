import java.util.Scanner;
public class Prime1 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);

		System.out.print("수 입력 : ");
		int n=sc.nextInt();
		
		if(pri(n)==2)
			System.out.println(n+"은(는) 소수이다.");
		else
			System.out.println(n+"은(는) 소수가 아니다.");		
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