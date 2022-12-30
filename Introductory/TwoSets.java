import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

//Built using CHelper plug-in
//Living Life In the Night :)
//Anime :>
//Never Give Up

public class TwoSets {
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
if(n*(n+1)/2%2 != 0){
    out.println("NO");
}
else{
ArrayList<Integer> v1 = new ArrayList<>();
ArrayList<Integer> v2 = new ArrayList<>();
int j = 0;
if(n % 4 != 0)
    j = 3;
else
     j=4;
for(int i = 0; i < (n-1)/4; i++ ){
        v1.add(4*i+1+j);
        v1.add(4*i+4+j);
        v2.add(4*i+2+j);
        v2.add(4*i+3+j);
    }
if(n%4 !=0){
        v1.add(1);
        v1.add(2);
        v2.add(3);
    }
    else{
        v1.add(1);
        v1.add(4);
        v2.add(3);
        v2.add(2);
    }
    out.println("YES");
    out.println(v1.size());
    for(int i : v1)
      out.print(i + " ");
    out.println();
    out.println(v2.size());
    for(int i : v2)
      out.print(i + " ");
    out.println();
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
public long nextLong() {
    return Long.parseLong(next());
}
}