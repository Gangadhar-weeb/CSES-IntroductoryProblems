import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.StringTokenizer;

//Built using CHelper plug-in
//Living Life In the Night :)
//Anime :>
//Never Give Up

public class permutations {
public static void main(String[] args) {
InputStream inputStream = System.in;
OutputStream outputStream = System.out;
InputReader in = new InputReader(inputStream);
PrintWriter out = new PrintWriter(outputStream);
TaskB1 solver = new TaskB1();
//int testCount = Integer.parseInt(in.next());
//for (int i = 1; i <= testCount; i++)
solver.solve(1, in, out);
out.close();
}
}
 
class TaskB1 {
public void solve(int testNumber, InputReader in, PrintWriter out){

// Code begins here
int n = in.nextInt();
    if(n == 1 ){
        out.print(1);
    } 
    else if(n == 2 || n == 3) {
        out.print("NO SOLUTION");
    }
    else if(n%2 == 0){
        for(int i = 2; i <= n; i+=2)
            out.print(i + " ");
        for(int i = 1; i < n; i+=2)
            out.print(i + " ");
    }
    else{
        for(int i = n-1; i > 0; i -= 2)
            out.print(i + " ");
        
        for(int i = n; i > 0; i -= 2)
            out.print(i + " ");
        
    }
}

}

 
class InputReader {
public BufferedReader reader;
public StringTokenizer tokenizer;
public InputReader(InputStream stream) {
reader = new BufferedReader(new InputStreamReader(stream), 32768);
tokenizer = null;
}
 
public String next()
{
 
while (tokenizer == null || !tokenizer.hasMoreTokens()) 
{
try {
tokenizer = new StringTokenizer(reader.readLine());
}
catch (IOException e) {
throw new RuntimeException(e);
}
}
return tokenizer.nextToken();
}
 
public int nextInt() {
return Integer.parseInt(next());
}
// public long nextLong() {
//     return Long.parseLong(next());
// }
}