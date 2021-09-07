package Array;

public class ForEx2 {

	public static void main(String[] args) {
		
		int[] a = new int[100];
        int sum = 0;

        for(int i=0; i<a.length; i++) 
        	a[i] = i + 1;
        for(int i=0; i<a.length; i++) {
        	if(a[i]==1) System.out.print("1");
        	else System.out.print("+"+a[i]);
        	sum+=a[i];
        }
        System.out.print("="+sum);
	}

}
