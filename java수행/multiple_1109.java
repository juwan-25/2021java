import java.util.Scanner;
public class multiple_1109{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int num, last, cnt=0, sum=0;
		System.out.print("���� ��� : ");
		num=sc.nextInt();
		System.out.print("������ �� : ");
		last=sc.nextInt();
		
		for(int i=1; i<=40; i++)
			System.out.print("=");
		System.out.println();
		System.out.print("1~"+last+"������ "+num+"�� ��� : ");
		for(int i=1; i<=last; i++){
			
			if(i%num==0){ 
				System.out.print(i+"   ");
				cnt++;
				sum+=i;
			}
		}
		System.out.println();
		System.out.println("1~"+last+"������ "+num+"�� ����� ���� : "+cnt);
		System.out.println("1~"+last+"������ "+num+"�� ����� �� : "+sum);
		for(int i=1; i<=40; i++)
			System.out.print("=");
		System.out.println();
	}
}