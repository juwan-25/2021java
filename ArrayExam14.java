package Array;

public class ArrayExam14 {

	public static void main(String[] args) {
		int[][] a=new int[4][4];
		int num=1;
		for(int i=0; i<a.length; i++) 
			for(int j=0; j<a[i].length; j++) {
				a[i][j]=num++;
				if(i==j) break;
				
			}

		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+"\t");
				if(i==j) break;
			}
			System.out.println();
			
		}

	}

}
