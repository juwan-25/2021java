import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main3{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int A,B,T;
        
        T=Integer.parseInt(s);
        
        for(int i=1; i<=T; i++){
            A=Integer.parseInt(s);
            B=Integer.parseInt(s);
            bw.write((A+B)+ "\n");
        }

        bw.flush();
        bw.close();
    }
}