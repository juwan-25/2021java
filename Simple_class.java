package Class;
class Ex_class {
	String car_name;
	private int size;
	void set_size() {
		size=2500;
	}
	int get_size() {
		return size;
	}
}
public class Simple_class {

	public static void main(String[] args) {
		Ex_class ex=new Ex_class();
		ex.car_name="�׷���";
		ex.set_size();
		System.out.println("���� : "+ex.car_name+" ũ�� : "+ex.get_size());
	}

}
