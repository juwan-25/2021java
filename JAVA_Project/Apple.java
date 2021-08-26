public class Apple{
	public static void main(String args[]){
		int cs,yh=0;
		for(int i=1;i<=100;i++){
			cs=0;
			for(int j=1; j<=100; j++){
				if(cs-1==yh+1&& cs+1==2*(yh-1)){
						System.out.println("철수의 사과 개수 : "+cs);
						System.out.println("영희의 사과 개수 : "+yh);
				}
				cs++;
			}
			yh++;
		}
	}
}