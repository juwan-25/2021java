public class ContinueExam1_1{
	public static void main(String args[]){
		for(int i=1;i<=10;i++){
			System.out.print(i+" ");
			if(i==5) continue;	//반복문에 영향 없음
		}
	}
}