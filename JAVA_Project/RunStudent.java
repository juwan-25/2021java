package prog4;

public class RunStudent {

	public static void main(String[] args) {
		Student stu1 = new Student();
		Student stu2 = new Student();
		
		stu1.name = "юлаж©о";	
		stu1.weight = 45;	
		stu1.height = 165;	
		stu1.stuID = 1109;
		stu1.grade = 1;
		stu1.ban = 1;
		
		stu1.sleep();
		stu1.wakeUp();
		stu1.eat();
		stu1.study();
		stu1.play();

	}

}
