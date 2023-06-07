import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    Parentheses(n,0,0,"");
	}
	public static void Parentheses(int n,int close,int open,String ans)
	{
	    if(close==n && open==n)
	    {
	        System.out.println(ans);
	        return;
	    }
	    if(open<n)
	    {
	        Parentheses(n,close,open+1,ans+'(');
	    }
	    if(close<open)
	    {
	        Parentheses(n,close+1,open,ans+')');
	    }
	}
}
