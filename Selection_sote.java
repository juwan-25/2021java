package Array;

public class Selection_sote {

	public static void main(String[] args) {

		int[] sel= new int[] {3,2,4,7,1};
		int temp;
		
		for(int i=0; i<sel.length; i++)
			System.out.print(sel[i]+" ");
		System.out.println();
		
		for(int i=0; i<sel.length; i++) {
			for(int j=i+1; j<sel.length; j++) {
				if(sel[i]>sel[j]) {
					temp=sel[i];
					sel[i]=sel[j];
					sel[j]=temp;
				}
			}	
		}
		
		for(int i=0; i<sel.length; i++)
			System.out.print(sel[i]+" ");
	}
}
