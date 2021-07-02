import java.util.Scanner;
public class divisor_1109{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int yak, num;
		System.out.print("약수를 구할 수 입력 : ");
		num=sc.nextInt();
		
		System.out.print(num+"의 약수 : ");
		for(int i=1; i<=num; i++)
			if(num%i==0) System.out.print(i+" ");
		System.out.println();
	}
}