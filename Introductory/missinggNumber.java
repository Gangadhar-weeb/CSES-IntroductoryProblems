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

public class missinggNumber {
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
long n = in.nextLong();
long sum = 0;
for (int i = 1; i < n; i++) {
    int a = in.nextInt();
    sum += a;
}
System.out.println(n*(n+1)/2 - sum);


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