package prog;

public class test_06 {

	public static void main(String[] args) {

		//��������� ����
		short a;
		a=10;
		a=15;
		System.out.println(a);
		a=(short)33000; //��������ȯ
		short b,c=(20+5)*3;
		System.out.println("������ �켱���� : "+a+" "+c);
		//byte : -128~127, call by value
		
		char ch='a';
		System.out.println(ch);
		System.out.println((int)ch);
		int su=97;
		System.out.println(su);
		System.out.println((char)su);
		//char
		
		boolean z1=true;
		boolean z2=false;
		System.out.println(z1);
		//�񱳿����ڿ� �������ڴ� ������� booleanŸ��
		
		int ii=100; //�������� �⺻�� int
		long ll=100L;
		float fff=(float)1.1;
		float ff=1.1f;
		double dd=1.1;
		
		int tt=(int)5.8;
		System.out.println(tt); //���� ����
		double ttt=5.8;
		
		double ee=4.5+10; //�ڵ�����ȯ
		System.out.println(ee);
		
		//���������� ����
		int pl=1;
		System.out.println("bpl = "+pl);
		int bp=++pl;
		int ap=pl++;
		System.out.println("bp = "+bp+", ap = "+ap);
		
		
		
		
		
	}

}
