package Array;

public class ArrayExam12 {

	public static void main(String[] args) {
		//초기값을 주는 부분과 출력하는 부분을 분리하는 것이 좋음
		int[][] a=new int[4][4];
		for(int i=0; i<a.length; i++) 
			for(int j=0; j<a[i].length; j++) a[i][j]=1;

		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++)
				System.out.print(a[i][j]+"  ");
			System.out.println();
		}
	}

}
