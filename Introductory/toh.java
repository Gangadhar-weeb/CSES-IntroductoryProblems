import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.StringTokenizer;

public class toh {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            System.out.println((1<<n)-1);
            TOH(1,2,3,n);
        }
    

     static void TOH(int i, int j, int k, int n) {
        if(n == 0){
           return;
        }
        TOH(i,k,j,n-1);
        System.out.println(i+" "+k);
        TOH(j,i,k,n-1);
       

    }
}

    
    

