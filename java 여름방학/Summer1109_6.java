import java.util.Scanner;
public class Summer1109_6 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int age=sc.nextInt();
		
		if(age==17) {
			System.out.print("���� �Է�(��/��) : ");
			char gen=sc.next().charAt(0);
	
			System.out.print("Ű �Է� : ");
			int hei=sc.nextInt();

			if(gen=='��') {
				if(hei>172) System.out.println("Ű�� ��պ��� Ů�ϴ�.");
				else if(hei==172) System.out.println("Ű�� ����Դϴ�.");
				else System.out.println("Ű�� ��պ��� �۽��ϴ�.");
			}
			else if(gen=='��') {
				if(hei>160) System.out.println("Ű�� ��պ��� Ů�ϴ�.");
				else if(hei==160) System.out.println("Ű�� ����Դϴ�.");
				else System.out.println("Ű�� ��պ��� �۽��ϴ�.");
			}
			else System.out.println("�߸��� ���� �Է��Դϴ�.");
		}	
		else System.out.println("�׽�Ʈ�� ������ �� �����ϴ�.");

		
	}
}