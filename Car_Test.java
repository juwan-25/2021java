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
}

public class Car_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car morning = new Car(); //�⺻ ������ : �ϴ� ���� ������ ���� �߻�X, �޼���� ����� ��������� ��ȯ���� ����
		Car sm3 = new Car();
		morning.�𵨸�="���";
		morning.������="����";
		morning.speedup();
		morning.stop();
		sm3.speedup();
		sm3.stop();

	}

}
