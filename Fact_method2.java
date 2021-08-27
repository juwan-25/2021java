import java.util.Scanner;
public class Fact_method2 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);

		int n,i=1; //fact=1;
		System.out.print("수 입력 : ");
		n=sc.nextInt();

		System.out.print(n+"!=");
		do{
			//fact*=i;
			if(i==n) System.out.print(i);
			else System.out.print(i+"*");
			i++;	
		}while(i<=n);
		System.out.print("="+fact(n));
	}
	static int fact(int val){
		if(val==1) return 1;		//리커시브 쿼리, 재귀 호출
		else return val*fact(val-1);
	}
}