//1109 ���ֿ�
import java.util.Scanner;
public class weight_1109{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		double weight, avg, sum=0;
		System.out.print("5���� �����Ը� �Է��Ͻÿ�. ");
		for(int i=1; i<=5; i++){
			weight=sc.nextDouble();
			sum+=weight;
		}
		
		System.out.println("�������� �� = "+sum);
		avg=(double)sum/5;
		System.out.println("�������� ��� = "+avg);

	}
}