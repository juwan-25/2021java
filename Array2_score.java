package Array;

import java.util.Scanner;

public class Array2_score {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[][] a=new int[5][3];
		int[] sum=new int[5];
		int max=0, num=0;
		String[] sub_t= {"�ϼ���", "û�Ǽ�", "���ص�"};
		
		//�Է�
		for(int i=0; i<a.length; i++) {
			System.out.println(i+1+"�� ���� �Է�");
			for(int j=0; j<a[i].length; j++) {
				System.out.print(sub_t[j]+">> ");
				a[i][j]=sc.nextInt();
				if(a[i][j]<0 || a[i][j]>100) j--;
/*
 				while(true) {
					System.out.print(sub_t[j]+">> ");
					a[i][j]=sc.nextInt();
					if(a[i][j]>=0 && a[i][j]<=20) break;
					System.out.println("0~20 ���� ������ �ٽ� �Է��ϼ���.");
				 }
 */				
			}
			System.out.println();
		}
		
		//ó��
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				sum[i]+=a[i][j];
				if(sum[i]>max) {
					max=sum[i];
					num=i+1;
				}
			}
		}
		
		//�� �� ���� ���
		System.out.println("=======================================");
		for(int i=0; i<sub_t.length; i++)
			System.out.print("\t"+sub_t[i]);
		System.out.print("\t�հ�");
		System.out.println();
		System.out.println("=======================================");
		for(int i=0; i<a.length; i++) {
			System.out.print((i+1)+"�� : ");
			for(int j=0; j<a[i].length; j++) 
				System.out.print("\t"+a[i][j]);
			System.out.print("\t"+sum[i]);
			System.out.println();
		}
		System.out.println("=======================================");
		System.out.println();
		
		//���� ���
		System.out.println("�ְ��� : "+num+"��° �� -> ���� : "+max);

	}

}
