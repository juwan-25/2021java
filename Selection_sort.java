package Array;

import java.util.Scanner;

public class Selection_sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("데이터 갯수 입력 >> ");
		int index=sc.nextInt();
		int temp;
		int[] sel= new int[index];
		
		System.out.print("데이터 입력 >> ");
		for(int i=0; i<sel.length; i++) 
			sel[i]=sc.nextInt();
		System.out.println();
		
		for(int i=0; i<sel.length; i++)
			System.out.print(sel[i]+" ");
		System.out.println();
		
		for(int i=0; i<sel.length-1; i++) {
			for(int j=i+1; j<sel.length; j++) {
				if(sel[i]>sel[j]) {
					temp=sel[i];
					sel[i]=sel[j];
					sel[j]=temp;
				}
			}	
		}
		
		for(int i=0; i<sel.length; i++)
			System.out.print(sel[i]+" ");
	}

}
