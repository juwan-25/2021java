package Array;

public class Bubble {

	public static void main(String[] args) {
		
		int[] bub= new int[] {3,2,7,1,5,4,6,1,2,3};
		int temp;
		
		for(int i=0; i<bub.length; i++)
			System.out.print(bub[i]+" ");
		System.out.println();
		
		for(int i=bub.length-2; i>=0; i--) {
			for(int j=0; j<=i; j++) {
				if(bub[j]>bub[j+1]) {
					temp=bub[j];
					bub[j]=bub[j+1];
					bub[j+1]=temp;
				}
			}
		}

		for(int i=0; i<bub.length; i++)
			System.out.print(bub[i]+" ");

	}

}
