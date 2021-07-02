public class section_1109_2{
	public static void main(String args[]){
		for(int i=5; i<=50; i+=5){
			System.out.println("1 ~ "+i+" --> "+sum(i));
		}
	}
	static int sum(int s){
		int a=0;
		for(int j=1; j<=s; j++) a+=j;
		return a;
	}
}