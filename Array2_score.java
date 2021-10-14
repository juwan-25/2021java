package Array;

import java.util.Scanner;

public class Array2_score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a=new int[5][3];
		int max=0, num=0, sum=0;
		
		for(int i=0; i<a.length; i++) {
			sum=0;
			System.out.print(i+1+"조 점수 입력 >> ");
			for(int j=0; j<a[i].length; j++) {
				a[i][j]=sc.nextInt();
				sum+=a[i][j];
			}
			if(sum>max) {
				max=sum;
				num=i+1;
			}
			
		}
		System.out.println("최고팀 : "+num+"번째 팀 -> 점수 : "+max);

	}

}
