import java.util.Scanner;
public class Array {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
/*		
		int[] a; int a[];
		int[] a=new int[5];
		a[0]=1;
		a[3]=3;
*/
		//int[] a={1, 2, 3, 4, 5};
		//int[] a=new int[5]{1, 2, 3, 4, 5}; <- 에러 발생, 갯수 쓰면 안됨

		int[] a=new int[]{1, 2, 3, 4, 5}; //이렇게 써야 에러 발생XX
		for(int i=0; i<=4; i++)
			System.out.print(a[i]+" ");
		int[] b=new int[100];
		System.out.println("**********"+b.length)
		for(int i=0; i<b.length; i++)
			System.out.print(i+" : "+b[i]);
		
	}
}