package Array;

import java.util.Scanner;

public class merge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int temp;
		int[] a=new int[5];
		int[] b=new int[5];
		int[] c=new int[10];
		
		//데이터 입력
		System.out.print("첫번째 배열 입력 >> ");
		for(int i=0; i<a.length; i++)
			a[i]=sc.nextInt();	
		System.out.print("두번째 배열 입력 >> ");
		for(int i=0; i<b.length; i++)
			b[i]=sc.nextInt();
		
		//데이터 오름차순 정렬 : selection 정렬 이용
		for(int i=0; i<a.length-1; i++)
			for(int j=i+1; j<a.length; j++)
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
		for(int i=0; i<b.length-1; i++)
			for(int j=i+1; j<b.length; j++)
				if(b[i]>b[j]) {
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
		
		//정렬 후 데이터 a,b 출력
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
		System.out.println();		
		for(int i=0; i<b.length; i++)
			System.out.print(b[i]+" ");
		System.out.println();
		
		//merge(병합) 
		int x=0, y=0, z=0;
		
		while(true) {
			if(a[x]<b[y]) {
				c[z]=a[x];
				x++; z++;
			}
			else if(a[x]>b[y]) {
				c[z]=b[y];
				y++; z++;
			}
			else {
				c[z]=a[x];
				x++; y++; z++;
			}
			if(x==a.length||y==b.length) break;
		}
		
		//merge 후 나머지 값 정렬
		if(x==a.length) {
			for(int i=y; i<b.length; i++) {
				c[z]=b[i];
				z++;
			}			
		}
		else if(y==b.length) {
			for(int i=y; i<a.length; i++) {
				c[z]=a[i];
				z++;
			}
		}
		
		//결과값 출력
		for(int i=0; i<c.length; i++)
			System.out.print(c[i]+" ");
	}

}
