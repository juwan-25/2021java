package prog;

import java.util.Scanner;

public class Number_Game {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int su, cnt=0;
		int num = (int)(Math.random()*100)+1;
		
		while(true) {
			System.out.print("1~100 사이 수 입력 >> ");
			su=sc.nextInt();
			cnt++;
			if(su>num) System.out.println("입력한 수보다 작습니다.");
			else if(su==num) break;
			else System.out.println("입력한 수보다 큽니다.");
		}
		System.out.println("정답입니다.");
		System.out.println(cnt+"회 입력하여 정답을 찾았습니다.");
		
		if(cnt<4)System.out.println("Great!");
		else if(cnt<8)System.out.println("Good!");
		else System.out.println("노력하세요:)");
	}

}
