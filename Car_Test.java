package Class;
class Car{
	String 모델명;
	String 제조사;
	void speedup() {
		System.out.println(모델명+"SpeedUp");
	}
	void stop() {
		System.out.println(모델명+"Stop");
	}
	Car(){
		System.out.println("기본생성자");
	}
}

public class Car_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car morning = new Car(); //기본 생성자 : 하는 일이 없으면 에러 발생X, 메서드와 비슷한 모양이지만 반환형이 없음
		Car sm3 = new Car();
		morning.모델명="모닝";
		morning.제조사="현대";
		morning.speedup();
		morning.stop();
		sm3.speedup();
		sm3.stop();

	}

}
