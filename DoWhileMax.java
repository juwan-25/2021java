import java.util.Scanner;
public class DoWhileMax{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		int num,max=0;
		do{
			num=sc.nextInt();
			if(num>0)
				if(num>max) max=num;
		}while(num!=0);
		System.out.println("�ִ밪 : "+max);
	}
}