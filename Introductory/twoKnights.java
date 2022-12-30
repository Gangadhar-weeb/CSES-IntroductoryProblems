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

public class twoKnights {
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
int i = in.nextInt();
for(int k = 1; k <= i; k++){
    long m = k*k, n = m * (m - 1)/2;
    if(k > 2){
        n -= 4*(k-1)*(k-2);
    }
    out.println(n);
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
