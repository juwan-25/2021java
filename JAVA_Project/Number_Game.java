package prog;

import java.util.Scanner;

public class Number_Game {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int su, cnt=0;
		int num = (int)(Math.random()*100)+1;
		
		while(true) {
			System.out.print("1~100 ���� �� �Է� >> ");
			su=sc.nextInt();
			cnt++;
			if(su>num) System.out.println("�Է��� ������ �۽��ϴ�.");
			else if(su==num) break;
			else System.out.println("�Է��� ������ Ů�ϴ�.");
		}
		System.out.println("�����Դϴ�.");
		System.out.println(cnt+"ȸ �Է��Ͽ� ������ ã�ҽ��ϴ�.");
		
		if(cnt<4)System.out.println("Great!");
		else if(cnt<8)System.out.println("Good!");
		else System.out.println("����ϼ���:)");
	}

}
