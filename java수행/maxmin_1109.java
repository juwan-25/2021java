import java.util.Scanner;
public class maxmin_1109{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("입력할 데이타의 수 : ");
		int data=sc.nextInt();
		
		System.out.print(i+"번째 수 입력 : ");
		int num=sc.nextInt();

		for(int i=1; i<=data; i++) {
			System.out.print(i+"번째 수 입력 : ");
			int num=sc.nextInt();
			if(num>max) max=num;
			else if(num<min) min=num;
		}

		System.out.println("=============================");
		System.out.println("가장 큰 수 : "+max);
		System.out.println("가장 작은 수 : "+min);
		System.out.println("=============================");
		
	}
}