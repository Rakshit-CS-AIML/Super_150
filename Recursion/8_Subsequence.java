import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s = sc.next();
	    Subseq(s,"");
	}
	public static void Subseq(String s,String ans)
	{
	    if(s.length()==0)
	    {
	        System.out.println(ans);
	        return;
	    }
	    char ch = s.charAt(0);
	    Subseq(s.substring(1),ans);
	    Subseq(s.substring(1),ans+ch);
	}
}
