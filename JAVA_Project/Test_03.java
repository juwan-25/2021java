
public class Test_03 {

	public static void main(String[] args) {
		
		//call by value이기 때문에 연산 가능
		char ch1 = 'A';
		char ch2 = 'B';
		int code = ch1 + ch2;
		
		System.out.println(code);
		
		char ch3 = 'A';
		char ch4 = 'Z';
		for(int i=ch3; i<=ch4; i++)
			System.out.print((char)i);
		System.out.println();
		
		char ch5 = 'A';
		char ch6 = 'Z';
		
		for(int i=ch5; i<=ch6; i++) {
			for(int j=i; j<=ch6; j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}
		
		for(int i=ch5; i<=ch6; i++) {
			for(int j=ch5; j<=i; j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}
		
		
	}

}
