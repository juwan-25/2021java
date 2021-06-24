import java.util.Scanner;
public class For_Test4 { 
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("팩토리얼 계산 수 입력 : ");
		int num=sc.nextInt();

		int result=fact(num);
		System.out.println(result);
	}
	static int fact(int a) {

		int sum=1;

		for(int i=1; i<=a; i++)
			sum*=i;

		return sum;
	}
}