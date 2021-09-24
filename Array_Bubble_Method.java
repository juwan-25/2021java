package Array;

import java.util.Scanner;

public class Array_Bubble_Method {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("데이터 갯수 입력 >> ");
		int index=sc.nextInt();
		int[] bub= new int[index];
		
		System.out.print("데이터 입력 >> ");
		for(int i=0; i<bub.length; i++) 
			bub[i]=sc.nextInt();
		System.out.println();
		
		for(int i=0; i<bub.length; i++)
			System.out.print(bub[i]+" ");
		System.out.println();
		
		bubble(bub);

		for(int i=0; i<bub.length; i++)
			System.out.print(bub[i]+" ");


	}
	static void bubble(int[] arr) {
		int temp;
		for(int i=arr.length-2; i>=0; i--) 
			for(int j=0; j<=i; j++) 
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}			
	}
}
