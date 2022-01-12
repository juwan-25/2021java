package prog6_1;

import java.util.ArrayList;

public class ArrayLIstTest {
//배열과 달리 추가, 제거 가능
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("마이멜로디");
		arrList.add("헬로키티");
		arrList.add("포챠코");
		arrList.add("폼폼푸린");
		arrList.add("쿠로미");
		arrList.add("시나모롤");
		
		arrList.remove("포챠코");
		arrList.add("포차코");
		
		for(int i=0; i<arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
	}

}
