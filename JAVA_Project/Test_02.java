import java.util.Scanner;

public class Test_02 {

	public static void main(String[] args) {
		
		String str1 = "A";
		// call by reference + call by value
		System.out.println(str1+1);
		
		char ch = 'A';
		// call by value + call by value
		System.out.println(ch+1);  
		System.out.println((char)(ch+1));
		
		/*
			call by reference는 주소라서 계산이 불가능
			재시작하면 메모리 중 아무 곳에서나 생성
			주소는 의미가 없음
			값에 의한 호출
			기본형 타입
			reference 타입
		*/
		/*
			call by value는 값이라서 계산이 가능
			참조형 타입
			stack : 값에 연결
		 */
		int a = 10;
		int b = 10;
		int c = a+b;
		
		if(a==b) System.out.println("같다");
		else System.out.println("다른다");
		
		String str2 = new String("Hi");
		String str3 = new String("Hi");
		
		//call by reference 이기 때문에 +가 문자연결자가 됨
		System.out.println(str2+str3);
		
		//call by reference이기 때문에 == 연산자 사용불가
		if(str2.equals(str3)) System.out.println("같다");
		else System.out.println("다르다");
		
		//주소가 연결되지 못하거나 변수와 연결되지 못한 값들 <- 가비지 컬렉션 작용
	}

}
