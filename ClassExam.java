package Class;

class Student{
	String name;
	int grade;
	int ban;
	int number;
	private String telephone;
	void set_tel() {
		telephone = "123-345-6789";
	}
	String get_tel() {
		return telephone;
	}
}

public class ClassExam {

	public static void main(String[] args) {
		Student kim=new Student();
		kim.name="������";
		kim.grade=2;
		kim.number=14;
		kim.set_tel();
		//kim.telephone="123-345-6789";
		System.out.println("�л����� : "+kim.name+" "+kim.grade+" "+kim.number+" "+kim.get_tel());
	}
}

//�����ڴ� private���� ���� ����
