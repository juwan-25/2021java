package Array;

import java.util.Scanner;

public class Bubble {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("데이터 갯수 입력 >> ");
		int index=sc.nextInt();
		int temp;
		int[] bub= new int[index];
		
		System.out.print("데이터 입력 >> ");
		for(int i=0; i<bub.length; i++) 
			bub[i]=sc.nextInt();
		System.out.println();
		
		for(int i=0; i<bub.length; i++)
			System.out.print(bub[i]+" ");
		System.out.println();
		
		for(int i=bub.length-2; i>=0; i--) {
			for(int j=0; j<=i; j++) {
				if(bub[j]>bub[j+1]) {
					temp=bub[j];
					bub[j]=bub[j+1];
					bub[j+1]=temp;
				}
			}
		}

		for(int i=0; i<bub.length; i++)
			System.out.print(bub[i]+" ");

	}

}
