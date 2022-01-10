package prog4;

public class Parent {
//final은 초기화 된 값만 사용가능, 변경불가
	final int restTime = 10;
	
	public final void rest() {
		System.out.println(+restTime+"분간 휴식을 한다.");
	}
}
