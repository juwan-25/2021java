package prog4;

public class RunInstanceVal {

	public static void main(String[] args) {
		instanceVal tv1 = new  instanceVal("Black", 55);
		instanceVal tv2 = new  instanceVal("Sliver", 65);
		instanceVal tv3 = new  instanceVal("Blue", 100);	
		
		tv1.PRODUCER = "삼성전자";
		System.out.printf("색상 : %s 크기 : %d 제조사 : %s\n", tv1.getColor(), tv1.getSize(), tv1.PRODUCER);
		System.out.printf("색상 : %s 크기 : %d 제조사 : %s\n", tv1.getColor(), tv1.getSize(), instanceVal.PRODUCER);
		System.out.printf("색상 : %s 크기 : %d 제조사 : %s\n", tv2.getColor(), tv2.getSize(), instanceVal.PRODUCER);
		System.out.printf("색상 : %s 크기 : %d 제조사 : %s\n", tv3.getColor(), tv3.getSize(), instanceVal.PRODUCER);
		
		
	}

}
