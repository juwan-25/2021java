package Array;

import java.util.Scanner;

public class Array2_score {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[][] a=new int[5][3];
		int[] sum=new int[5];
		int max=0, num=0;
		String[] sub_t= {"완성도", "청의성", "이해도"};
		
		//입력
		for(int i=0; i<a.length; i++) {
			System.out.println(i+1+"조 점수 입력");
			for(int j=0; j<a[i].length; j++) {
				System.out.print(sub_t[j]+">> ");
				a[i][j]=sc.nextInt();
				if(a[i][j]<0 || a[i][j]>100) j--;
/*
 				while(true) {
					System.out.print(sub_t[j]+">> ");
					a[i][j]=sc.nextInt();
					if(a[i][j]>=0 && a[i][j]<=20) break;
					System.out.println("0~20 사이 점수로 다시 입력하세요.");
				 }
 */				
			}
			System.out.println();
		}
		
		//처리
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				sum[i]+=a[i][j];
				if(sum[i]>max) {
					max=sum[i];
					num=i+1;
				}
			}
		}
		
		//각 조 점수 출력
		System.out.println("=======================================");
		for(int i=0; i<sub_t.length; i++)
			System.out.print("\t"+sub_t[i]);
		System.out.print("\t합계");
		System.out.println();
		System.out.println("=======================================");
		for(int i=0; i<a.length; i++) {
			System.out.print((i+1)+"조 : ");
			for(int j=0; j<a[i].length; j++) 
				System.out.print("\t"+a[i][j]);
			System.out.print("\t"+sum[i]);
			System.out.println();
		}
		System.out.println("=======================================");
		System.out.println();
		
		//최종 출력
		System.out.println("최고팀 : "+num+"번째 팀 -> 점수 : "+max);

	}

}
