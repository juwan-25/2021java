import java.util.Scanner;
public class WhileScore1{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		int sum=0, cnt=0, score=1;
		while(score!=0){
			score=sc.nextInt();
			sum+=score;
			cnt++;
		}
		System.out.println("�� : "+sum);
		System.out.println("��� : "+(double)sum/(cnt-1));
	}
}