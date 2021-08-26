import java.util.Scanner;
public class WhileScore2{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		int sum=0, cnt=0;
		int score=sc.nextInt();
		while(score!=0){
			sum+=score;
			cnt++;
			score=sc.nextInt();
		}
		System.out.println("Че : "+sum);
		System.out.println("ЦђБе : "+(double)sum/cnt);
	}
}