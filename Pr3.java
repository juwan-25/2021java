import java.util.Scanner;
public class Pr3 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
        
      	int a;
        
        	a=sc.nextInt();

       	if(a%4==0&&a%100==0) {
		if(a%400==0) System.out.print(1);
      		else System.out.print(0);
 	}
      	else System.out.print(0);
    }
}