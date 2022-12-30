import java.io.*;
import java.util.*;

public class creatingStrings
{
	static String s;
	static List<String> perms = new ArrayList<String>();
	static int[] charCount = new int[26];

	static void search(String curr)
	{
		// we've finished creating a permutation
		if (curr.length() == s.length())
		{
			perms.add(curr);
			return;
		}
		for (int i = 0; i < 26; i++)
		{
			// for all available characters
			if (charCount[i] > 0)
			{
				// add it to the current string and search
				charCount[i]--;
				search(curr + (char)(i + 'a'));
				charCount[i]++;
			}
		}
	}

	public static void main(String[] args) throws IOException
	{
		Kattio io = new Kattio();
		s = io.next();
		for (int i = 0; i < s.length(); i++)
		{
			charCount[s.charAt(i) - 'a']++;
		}
		search("");
		io.println(perms.size());
		for (String perm : perms)
		{
			io.println(perm);
		}
		io.close();
	}

	//BeginCodeSnip{Kattio}
	static class Kattio extends PrintWriter {
		private BufferedReader r;
		private StringTokenizer st;
		// standard input
		public Kattio() { this(System.in, System.out); }
		public Kattio(InputStream i, OutputStream o) {
			super(o);
			r = new BufferedReader(new InputStreamReader(i));
		}
		// USACO-style file input
		public Kattio(String problemName) throws IOException {
			super(problemName + ".out");
			r = new BufferedReader(new FileReader(problemName + ".in"));
		}
		// returns null if no more input
		public String next() {
			try {
				while (st == null || !st.hasMoreTokens())
					st = new StringTokenizer(r.readLine());
				return st.nextToken();
			} catch (Exception e) { }
			return null;
		}
		public int nextInt() { return Integer.parseInt(next()); }
		public double nextDouble() { return Double.parseDouble(next()); }
		public long nextLong() { return Long.parseLong(next()); }
	}
	//EndCodeSnip
}

