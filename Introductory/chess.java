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

public class chess {
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
    static String g[];
    static boolean sum[],diff[],c[];
    static int ans = 0;

    static void dfs(int r){
        if(r == 8){
            ++ans;
            return;
        }
        for (int i = 0; i < 8; ++i) {
			if (g[r].charAt(i) == '.' && !c[i] && !sum[i + r] && !diff[i - r + 7]) {
				c[i] = sum[i + r] = diff[i - r + 7] = true;
				dfs(r + 1);
				c[i] = sum[i + r] = diff[i - r + 7] = false;
			}
		}
    }
public void solve(int testNumber, InputReader in, PrintWriter out){

// Code begins here
g = new String[8];
sum = new boolean[15]; diff = new boolean[15]; c = new boolean[8];
		for (int i = 0; i < 8; ++i) {
			g[i] = in.next();
		}
		dfs(0);
		out.println(ans);
		

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