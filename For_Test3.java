public class For_Test3{
	public static void main(String args []) {
		double sum=0;
		
		for(int i=1; i<=100; i++){
			sum=sum+(double)1/i;
			if(i==1) System.out.print("1");	
			else System.out.print(" + (1/"+i+")");				
			}
		System.out.print(" = "+sum);
	}
}