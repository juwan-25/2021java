public class Apple{
	public static void main(String args[]){
		int cs,yh=0;
		for(int i=1;i<=100;i++){
			cs=0;
			for(int j=1; j<=100; j++){
				if(cs-1==yh+1&& cs+1==2*(yh-1)){
						System.out.println("ö���� ��� ���� : "+cs);
						System.out.println("������ ��� ���� : "+yh);
				}
				cs++;
			}
			yh++;
		}
	}
}