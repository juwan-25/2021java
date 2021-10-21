package Array;

import java.util.Scanner;

public class Array2_Score {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("참가하는 조의 수 입력 : ");
		int plp=sc.nextInt();
		System.out.print("평가 항목 수 입력 : ");
		int cont=sc.nextInt();
		System.out.println();
		int[][] a=new int[plp][cont+2];
		//int[] sum=new int[5];
		//int[] rank=new int[5];
		int max=0, num=0, cnt=0;
		String[] sub_t= {"완성도", "청의성", "이해도", "발표력", "공공성"};
		
		//입력
		for(int i=0; i<a.length; i++) {
			System.out.println(i+1+"조 점수 입력");
			for(int j=0; j<a[i].length-2; j++) {
				System.out.print(sub_t[j]+">> ");
				a[i][j]=sc.nextInt();
				if(a[i][j]<0 || a[i][j]>20) j--;
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
		//항목수 번째 방이 합계방
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length-2; j++) {
				a[i][cont]+=a[i][j];
				if(a[i][cont]>max) {
					max=a[i][cont];
					num=i+1;
				}
			}
		}
		for(int i=0; i<a.length; i++)
			a[i][cont+1]=1;
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i][cont]>a[j][cont]) a[j][cont+1]++;
				else if(a[i][cont]<a[j][cont]) a[i][cont+1]++;
			}
		}
		
		
		//각 조 점수 출력
		int l=22+cont*8;
		line(l, '=');
		for(int i=0; i<cont; i++)
			System.out.print("\t"+sub_t[i]);
		System.out.print("\t합계\t순위");
		System.out.println();
		line(l, '=');
		for(int i=0; i<a.length; i++) {
			System.out.print((i+1)+"조 : ");
			for(int j=0; j<a[i].length-2; j++) 
				System.out.print("\t"+a[i][j]);
			System.out.print("\t"+a[i][cont]+"\t"+a[i][cont+1]);
			System.out.println();
		}
		line(l, '=');
		System.out.println();

		//최종 출력
		System.out.println("최고팀 : "+num+"번째 팀 -> 점수 : "+max);
	}
	static void line(int su, char ch) {
		for(int i=0; i<su; i++)
			System.out.print(ch);
		System.out.println();
	}
}


