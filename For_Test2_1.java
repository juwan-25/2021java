public class For_Test2_1 {
	public static void main(String args []) {
		int i, cut=1;

		for(i=1; i<=4; i++){
			for(int j=0; j<=i-1; j++){
				if(j+cut==10) System.out.print((j+cut));	
				else System.out.print("0"+(j+cut));				
			}
			cut+=i;
			 System.out.println(" ");
		}
		
	}
}