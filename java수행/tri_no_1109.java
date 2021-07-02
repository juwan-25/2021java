import java.util.Scanner;
public class tri_no_1109{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int H;
		System.out.print("행을 입력하세요. >> ");
		H=sc.nextInt();
		
		for(int i=0; i<=H*H; i+=H){
			if(H==0) System.out.print(H);
			else{ for(int j=H; j>=0; j-=H-i) 
				System.out.print(j+"   ");
			}
			System.out.println();
		}
	}
}