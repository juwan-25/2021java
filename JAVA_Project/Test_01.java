
public class Test_01 {

	public static void main(String[] args) {
		
		//명시적 형변환(강제 형변환)
		int num; 
		num = (int)17.5;
		System.out.println(num);

		char ch = 'A';
		System.out.println((int)ch);
		
		//묵시적 형변환(자동 형변환)
		int code = ch;
		System.out.println(code);
	
		//Stirng 더하기 : call by reference
		String str1 = "A";
		String str2 = "B";
		System.out.println(str1+str2);
		
		//char 더하기 : call by value - 정수형, 실수형, 문자형, 논리형
		char str3 = 'A';
		char str4 = 'B';
		//자동 형변환
		System.out.println(str3+str4);
		
		
	}

}
