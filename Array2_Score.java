package Array;

import java.util.Scanner;

public class Array2_Score {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("�����ϴ� ���� �� �Է� : ");
		int plp=sc.nextInt();
		System.out.print("�� �׸� �� �Է� : ");
		int cont=sc.nextInt();
		System.out.println();
		int[][] a=new int[plp][cont+2];
		//int[] sum=new int[5];
		//int[] rank=new int[5];
		int max=0, num=0, cnt=0;
		String[] sub_t= {"�ϼ���", "û�Ǽ�", "���ص�", "��ǥ��", "������"};
		
		//�Է�
		for(int i=0; i<a.length; i++) {
			System.out.println(i+1+"�� ���� �Է�");
			for(int j=0; j<a[i].length-2; j++) {
				System.out.print(sub_t[j]+">> ");
				a[i][j]=sc.nextInt();
				if(a[i][j]<0 || a[i][j]>20) j--;
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
		//�׸�� ��° ���� �հ��
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
		
		
		//�� �� ���� ���
		int l=22+cont*8;
		line(l, '=');
		for(int i=0; i<cont; i++)
			System.out.print("\t"+sub_t[i]);
		System.out.print("\t�հ�\t����");
		System.out.println();
		line(l, '=');
		for(int i=0; i<a.length; i++) {
			System.out.print((i+1)+"�� : ");
			for(int j=0; j<a[i].length-2; j++) 
				System.out.print("\t"+a[i][j]);
			System.out.print("\t"+a[i][cont]+"\t"+a[i][cont+1]);
			System.out.println();
		}
		line(l, '=');
		System.out.println();

		//���� ���
		System.out.println("�ְ��� : "+num+"��° �� -> ���� : "+max);
	}
	static void line(int su, char ch) {
		for(int i=0; i<su; i++)
			System.out.print(ch);
		System.out.println();
	}
}


