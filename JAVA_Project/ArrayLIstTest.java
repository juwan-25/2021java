package prog6_1;

import java.util.ArrayList;

public class ArrayLIstTest {
//�迭�� �޸� �߰�, ���� ����
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("���̸�ε�");
		arrList.add("���ŰƼ");
		arrList.add("��í��");
		arrList.add("����Ǫ��");
		arrList.add("��ι�");
		arrList.add("�ó����");
		
		arrList.remove("��í��");
		arrList.add("������");
		
		for(int i=0; i<arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
	}

}
