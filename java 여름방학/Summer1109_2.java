import java.util.Scanner;
public class Summer1109_2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("��������(100�� ����) : ");
		int ts=sc.nextInt();
		System.out.print("��������(30�� ����) : ");
		int ps=sc.nextInt();

		System.out.print("���� �հ� : ");
		int total=sum(ts, ps);
		
		System.out.print("��� : ");
		int grade=grd(total);
	}
	static int sum(int ts, int ps)
	{
		int sum = (int)(ts*0.7)+ps;
		System.out.println(sum);

		return sum;
	}
	static int grd(int total)
	{
		if(total>=90) System.out.println("A");
		else if(total>=80) System.out.println("B");
		else if(total>=70) System.out.println("C");
		else if(total>=60) System.out.println("D");
		else System.out.println("E");
		
		return total;
	}
}