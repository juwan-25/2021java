//1109 이주완
import java.util.Scanner;
public class weight_1109{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		double weight, avg, sum=0;
		System.out.print("5명의 몸무게를 입력하시오. ");
		for(int i=1; i<=5; i++){
			weight=sc.nextDouble();
			sum+=weight;
		}
		
		System.out.println("몸무게의 합 = "+sum);
		avg=(double)sum/5;
		System.out.println("몸무게의 평균 = "+avg);

	}
}