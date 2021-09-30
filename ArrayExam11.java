package Array;

public class ArrayExam11 {

	public static void main(String[] args) {
		int[][]a= {{1,2,10},{20,30}};
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) 
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
}
