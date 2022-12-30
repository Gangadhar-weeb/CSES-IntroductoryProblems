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

public class palindromeReorder {
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
int[] count = new int[26];
        char[] arr = in.next().toCharArray();
        for(char c:arr)
            count[c-'A']++;
        int odd = 0,k=0;
        int ind = -1;
        for(int i:count){
            if((i&1)==1) {
                ind = k;
                odd++;
            }
            k++;
        }
        if(odd>1)
            out.println("NO SOLUTION");
        else {
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (i != ind) {
                    int half = count[i] / 2;
                    while (half-- > 0)
                        ans.append((char) (i + 'A'));
                }
            }
            out.print(ans);
            if (ind != -1) {
                StringBuilder mid = new StringBuilder();
                int x = count[ind];
                while (x-- > 0)
                    mid.append((char) (ind + 'A'));
                out.print(mid);
            }
 
            out.print(ans.reverse());
        }
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
// public long nextLong() {
//     return Long.parseLong(next());
// }
}
/*
 import java.util.Scanner;
 
public class Palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Get the input word and create variables
    String word = sc.next();
    int[] arr = new int[26];
    StringBuilder construct = new StringBuilder();
    char oddLetter = ' ';
    int oddCount = 0;
 
    // Get the frequency for each letter
    for (int i = 0; i < word.length(); i++) {
      arr[word.charAt(i) - 'A']++;
    }
 
    // Find the odd count and the odd letter
    for (int c = 0; c < arr.length; c++) {
      if (arr[c] % 2 == 1) {
        oddCount++;
        oddLetter = (char)(c + 'A');
      }
    }
 
    // If there are more than one odd letters, print "NO SOLUTION"
    if (oddCount > 1) {
      System.out.println("NO SOLUTION");
      return;
    }
 
    // Construct the first half of the palindrome
    for (int c = 0; c < arr.length; c++) {
      for (int i = 0; i < arr[c] / 2; i++) {
        construct.append((char)(c + 'A'));
      }
    }
 
    // Create the second half (reverse of the first half)
    String reverseConstructor = new StringBuilder(construct).reverse().toString();
 
    // Add the odd letters (if any)
    for (int i = 0; i < oddCount; i++) {
      construct.append(oddLetter);
    }
 
    // Print the palindrome
    System.out.println(construct + reverseConstructor);
  }
}
 */
