import java.util.Scanner;
public class Prime {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);

		int n,a=0;
		System.out.print("수 입력 : ");
		n=sc.nextInt();


		for(int i=1; i<=n; i++)
			if(n%i==0) a+=i;
		
		if(n==1)
			System.out.println(n+"은(는) 소수가 아니다.");
		else if(a>n+1)
			System.out.println(n+"은(는) 소수가 아니다.");
		else
			System.out.println(n+"은(는) 소수이다.");	

		for(int i=1; i<=n; i++)
			if(n%i==0) a++;
		
		if(a==2)
			System.out.println(n+"은(는) 소수이다.");
		else
			System.out.println(n+"은(는) 소수가 아니다.");		
	}
}