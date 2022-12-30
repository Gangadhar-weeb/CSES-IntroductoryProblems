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

public class digitQuery {
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
    private static long ind_pos(long n, long pos){
        long i = 1;
        while(n > 0){
            long temp0 = n% 10;
            if(i == pos)
                return temp0;
            n/=10;
            ++i;
        }
        return 0;
    }
public void solve(int testNumber, InputReader in, PrintWriter out){

// Code begins here
long q = in.nextLong();
while(q-->0){
    long n = in.nextLong();
    long dig = 1, curr = 0, c = 1;
    while(n > dig *9*c){
        n-=dig * 9 * c;
        dig++;
        curr = curr * 10 + 9;
        c *=10;
    }
    long temp = n/dig;
    curr += temp;
    long temp2 = n % dig;
    if(temp2 == 0)
        out.print(ind_pos(curr,1));
    else
        out.print(ind_pos(curr+1,dig-temp2+1));
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
