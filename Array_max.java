package Array;

import java.util.Scanner;
public class Array_max {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] score = new int[10];
		
		for(int i=0; i<score.length; i++) {
			System.out.print("score 입력 >> ");
        	score[i] = sc.nextInt();
		}
		
		int max=score[0];
		for(int i=0; i<score.length; i++)
			if(score[i]>max) max=score[i];
		System.out.println("최대값 : "+max);
	}

}
