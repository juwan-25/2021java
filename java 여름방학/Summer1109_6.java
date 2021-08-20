import java.util.Scanner;
public class Summer1109_6 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age=sc.nextInt();
		
		if(age==17) {
			System.out.print("성별 입력(남/여) : ");
			char gen=sc.next().charAt(0);
	
			System.out.print("키 입력 : ");
			int hei=sc.nextInt();

			if(gen=='남') {
				if(hei>172) System.out.println("키가 평균보다 큽니다.");
				else if(hei==172) System.out.println("키가 평균입니다.");
				else System.out.println("키가 평균보다 작습니다.");
			}
			else if(gen=='여') {
				if(hei>160) System.out.println("키가 평균보다 큽니다.");
				else if(hei==160) System.out.println("키가 평균입니다.");
				else System.out.println("키가 평균보다 작습니다.");
			}
			else System.out.println("잘못된 성별 입력입니다.");
		}	
		else System.out.println("테스트에 참여할 수 없습니다.");

		
	}
}