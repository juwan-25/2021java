import java.util.Scanner;
public class Main4 {
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
        
        		int A,B;
       		
		int i=1;
        		while(i>=1){
            			A=sc.nextInt();
            			B=sc.nextInt();
			if(A==0&&B==0) break;
            			System.out.println((A+B));
			i++;
        		}   
    	}
}