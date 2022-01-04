package prog2;

import java.util.Scanner;

public class ScoreArray {

	public static void main(String[] args) {
		String[] students= {"김윤서", "배서연", "백지민", "최자윤", "황유솔"};
		int[] sum=new int[5];

		Scanner sc=new Scanner(System.in);
		int obj_num;
		int[][] scores=new int[5][];
		for(int i=0; i<scores.length; i++) {
			System.out.println(students[i]);
			System.out.print("과목 수 입력 >> ");
			obj_num=sc.nextInt();
			scores[i]=new int[obj_num];
			for(int j=0; j<scores[i].length; j++) {
				System.out.print(j+1+"과목 성적 입력 >> ");
				scores[i][j] = sc.nextInt();
				sum[i]+=scores[i][j];
			}
		}
		
		for(int i=0; i<scores.length; i++) {
			System.out.print(students[i]+"\t");
			for(int j=0; j<scores[i].length; j++) {
				System.out.print(scores[i][j]+"\t");
			}
			System.out.print(sum[i]+"\t");
			System.out.printf("%.1f\n",(double)sum[i]/scores[i].length);
		}

	}

}
