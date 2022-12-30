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

public class grayCode {
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
static void generateGrayarr(int n)
{
    // base case
    if (n <= 0)
        return;
 
    // 'arr' will store all generated codes
    ArrayList<String> arr = new ArrayList<String> ();
 
    // start with one-bit pattern
    arr.add("0");
    arr.add("1");
 
    // Every iteration of this loop generates 2*i codes from previously
    // generated i codes.
    int i, j;
    for (i = 2; i < (1<<n); i = i<<1)
    {
        // Enter the previously generated codes again in arr[] in reverse
        // order. Nor arr[] has double number of codes.
        for (j = i-1 ; j >= 0 ; j--)
            arr.add(arr.get(j));
 
        // append 0 to the first half
        for (j = 0 ; j < i ; j++)
            arr.set(j, "0" + arr.get(j));
 
        // append 1 to the second half
        for (j = i ; j < 2*i ; j++)
            arr.set(j, "1" + arr.get(j));
    }
 
    // print contents of arr[]
    for (i = 0 ; i < arr.size() ; i++ )
        System.out.println(arr.get(i));
}
public void solve(int testNumber, InputReader in, PrintWriter out){

// Code begins here
int n = in.nextInt();
generateGrayarr(n);


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