package prog4;

public class RunInstanceVal {

	public static void main(String[] args) {
		instanceVal tv1 = new  instanceVal("Black", 55);
		instanceVal tv2 = new  instanceVal("Sliver", 65);
		instanceVal tv3 = new  instanceVal("Blue", 100);	
		
		tv1.PRODUCER = "�Ｚ����";
		System.out.printf("���� : %s ũ�� : %d ������ : %s\n", tv1.getColor(), tv1.getSize(), tv1.PRODUCER);
		System.out.printf("���� : %s ũ�� : %d ������ : %s\n", tv1.getColor(), tv1.getSize(), instanceVal.PRODUCER);
		System.out.printf("���� : %s ũ�� : %d ������ : %s\n", tv2.getColor(), tv2.getSize(), instanceVal.PRODUCER);
		System.out.printf("���� : %s ũ�� : %d ������ : %s\n", tv3.getColor(), tv3.getSize(), instanceVal.PRODUCER);
		
		
	}

}
