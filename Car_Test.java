package Class;
class Car{
	String �𵨸�;
	String ������;
	void speedup() {
		System.out.println(�𵨸�+"SpeedUp");
	}
	void stop() {
		System.out.println(�𵨸�+"Stop");
	}
	Car(){
		System.out.println("�⺻������");
	}
	Car(String model, String comp){//������
		�𵨸�=model;
		������=comp;
	}
}

public class Car_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car morning = new Car("���","����"); //�⺻������ : �ϴ� ���� ������ ���� �߻�X, �޼���� ����� ��������� ��ȯ���� ����, �Ű������� ���� ���� ����, class �� �̸��� ���ƾ� ��
		Car sm3 = new Car("SM3","�Ｚ");
//		morning.�𵨸�="���";
//		morning.������="����";
		morning.speedup();
		morning.stop();
//		sm3.�𵨸�="SM3";
//		sm3.������="�Ｚ";
		sm3.speedup();
		sm3.stop();

	}

}
