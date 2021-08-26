import java.util.Scanner;
public class WhileScore{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		double cnt=0;
		int sum=0, score=1;
		while(score!=0){
			score=sc.nextInt();
			sum+=score;
			cnt++;
		}
		System.out.println("Че : "+sum);
		System.out.println("ЦђБе : "+sum/cnt);
	}
}