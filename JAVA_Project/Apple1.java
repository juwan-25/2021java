public class Apple1{
	public static void main(String args[]){
		for(int cs=1;cs<=100;cs++){
			for(int yh=1; yh<=100; yh++){
				if(cs-1==yh+1&&cs+1==(yh-1)*2){
					System.out.println("Ã¶¼ö = "+cs+", ¿µÈñ = "+yh);
				}	
			}
		}
	}
}