import java.util.Scanner;
public class maxmin_1109{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�Է��� ����Ÿ�� �� : ");
		int data=sc.nextInt();
		
		System.out.print(i+"��° �� �Է� : ");
		int num=sc.nextInt();

		for(int i=1; i<=data; i++) {
			System.out.print(i+"��° �� �Է� : ");
			int num=sc.nextInt();
			if(num>max) max=num;
			else if(num<min) min=num;
		}

		System.out.println("=============================");
		System.out.println("���� ū �� : "+max);
		System.out.println("���� ���� �� : "+min);
		System.out.println("=============================");
		
	}
}