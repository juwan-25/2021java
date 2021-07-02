public class section_1109{
	public static void main(String args[]){
		int sum=0;
		for(int i=5; i<=50; i+=5){
			sum=0;
			for(int j=1; j<=i; j++)
				sum+=j;
			System.out.println("1 ~ "+i+" --> "+sum);
		}
	}
}