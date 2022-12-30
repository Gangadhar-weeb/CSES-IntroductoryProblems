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

public class appleDivision {
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
int[] weights = new int[n];
for(int i = 0 ; i < n; i++){
    weights[i] = in.nextInt();
}
long ans = Long.MAX_VALUE;
for(int bitMask = 0; bitMask < (1<<n); bitMask++){
    long a = 0;
    long b = 0;
    for(int i = 0; i < n ; i++){
        if((bitMask & (1<<i))>0){
            a += weights[i];
        }
        else{
            b += weights[i];
        }
    }
    ans = Math.min(ans, Math.abs(a - b));
}
out.println(ans);
out.close();


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
public long nextLong() {
    return Long.parseLong(next());
}
}
