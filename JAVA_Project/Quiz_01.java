package prog;

public class Quiz_01 {

	public static void main(String[] args) {
		// 100�̸��� ���ӵ� ���ڸ��� ¦�� 3���� ���ߴ��� 4****2�� �Ǿ���.
		// �� �� ���� ���� � ������, �׸��� �� ����� ������ ���ϴ� ���α׷���
		// for���� �̿��ؼ� �ۼ��Ͻÿ�.
		
		for(int i=10; i<96; i+=2) {
			int num=i*(i+2)*(i+4);
			if((num/100000)==4 && (num%10)==2)
						System.out.println(i+" "+(i+2)+" "+(i+4));
		}
	}

}
