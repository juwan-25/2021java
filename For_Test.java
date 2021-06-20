public class For_Test {
	public static void main(String args []) {
				
		for(int i=1; i<=100; i++){
			if(i==100) System.out.print("100");
			else if(i%10==3||i%10==6||i%10==9) System.out.print("X ");
			else System.out.print(i+" ");

			if(i%10==0) System.out.println(" "); 
		}
	}
}