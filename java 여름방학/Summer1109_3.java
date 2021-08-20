import java.util.Scanner;
public class Summer1109_3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("연필 : ");
		int pen=sc.nextInt();		
		System.out.print("지우개 : ");
		int ers=sc.nextInt();
		System.out.print("공책 : ");
		int note=sc.nextInt();
		
		int total =(pen*1000)+(ers*500)+(note*2000);
		System.out.println("총 금액 : "+total+"원");
		
		System.out.println("현금결제 하시겠습니까? (o/x로 답변)");
		char re=sc.next().charAt(0);

		if(re=='o') System.out.println((int)(total*0.1)+"원이 적립됩니다.");
		else if(re=='x') System.out.println("적립되지 않습니다.");
		else System.out.println("잘못된 입력입니다.");


	}
}