public class Gugudan { 
	public static void main(String args []) {
		for(int i=2; i<=9; i++){
			int a=7, b=10;
			
			System.out.print(i+"´Ü");
			lineprint(a,'@');
			lineprint(b,'-');
			
			for(int j=1; j<=9; j++) 
				System.out.println(i+"*"+j+"="+j*i);
			
			lineprint(b,'=');
		}
	}
	static void lineprint(int num, char op) {
		for(int i=1; i<=num; i++)
			System.out.print(op);
		
		System.out.println();
	}
}