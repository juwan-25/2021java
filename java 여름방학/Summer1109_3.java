import java.util.Scanner;
public class Summer1109_3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("���� : ");
		int pen=sc.nextInt();		
		System.out.print("���찳 : ");
		int ers=sc.nextInt();
		System.out.print("��å : ");
		int note=sc.nextInt();
		
		int total =(pen*1000)+(ers*500)+(note*2000);
		System.out.println("�� �ݾ� : "+total+"��");
		
		System.out.println("���ݰ��� �Ͻðڽ��ϱ�? (o/x�� �亯)");
		char re=sc.next().charAt(0);

		if(re=='o') System.out.println((int)(total*0.1)+"���� �����˴ϴ�.");
		else if(re=='x') System.out.println("�������� �ʽ��ϴ�.");
		else System.out.println("�߸��� �Է��Դϴ�.");


	}
}