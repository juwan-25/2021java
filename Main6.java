import java.util.Scanner;
public class Main6 {
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();
		int cnt=0;
		int a=N;
		for(int i=1; i>=1; i++){
			N=((N%10)*10) + (((N/10)+(N%10))%10);
			cnt++;
			if(a==N) break;
		}
		System.out.println(cnt);
	}
}