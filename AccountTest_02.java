package Class;

class Account{
	private int Account_num;
	private int balance;
	static int base_Acc_num=100; //�������� ����ϴ� ����
	static final double interest=0.02; //�������� ����ϸ鼭 ������ ����
	Account(){
		Account_num=++base_Acc_num;
	}
	void deposit(int money) {
		balance+=money;
	}
	void withdraw(int money) {
		if(money>balance) System.out.println("�ܾ��� �����մϴ�.");
		else balance-=money;
	}
	public String toString() {
		 return "���¹�ȣ : "+Account_num+" �ܾ� : "+balance;
	}
	void fixedDeposit(int principal, int year) {
		principal+=principal*interest*year;
		balance+=principal;
	}

}

public class AccountTest_02 {

	public static void main(String[] args) {
		System.out.println(Account.base_Acc_num); //1������
		
		Account Ac1 = new Account();
		System.out.println(Account.base_Acc_num); 
		System.out.println(Ac1.base_Acc_num); //2������
		
		System.out.println(Ac1.toString());
		
		Ac1.deposit(5000);		
		System.out.println(Ac1.toString());
		
		Ac1.withdraw(2000);		
		System.out.println(Ac1.toString());
		
		Ac1.withdraw(3500);		
		
		Account Ac2 = new Account();
		System.out.println(Account.base_Acc_num); 
		System.out.println(Ac1.base_Acc_num); 
		System.out.println(Ac2.base_Acc_num); //3������ 
		System.out.println(Ac2.toString());
		
		Account Ac3 = new Account();
		System.out.println(Ac3.toString());
		Ac3.fixedDeposit(100000, 3);
		System.out.println(Ac3.toString());
	}

}
