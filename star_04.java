public class star_04 {
	public static void main(String args []) {
		for(int i=1; i<=5; i++){ //За
			for(int j=1; j<=5-i; j++) //ї­
				System.out.print("  ");
			for(int j=1; j<=2*i-1; j++)
				System.out.print("* ");
			System.out.println(" ");
		}
	}
}