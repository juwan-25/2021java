
public class Test_02 {

	public static void main(String[] args) {
		
		String str1 = "A";
		// call by reference + call by value
		System.out.println(str1+1);
		
		char ch = 'A';
		// call by value + call by value
		System.out.println(ch+1);  
		System.out.println((char)(ch+1));
	}

}
