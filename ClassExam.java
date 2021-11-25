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
		kim.name="김현우";
		kim.grade=2;
		kim.number=14;
		kim.set_tel();
		//kim.telephone="123-345-6789";
		System.out.println("학생정보 : "+kim.name+" "+kim.grade+" "+kim.number+" "+kim.get_tel());
	}
}

//생성자는 private으로 쓰지 않음
