import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s = sc.next();
	    int res = Subseq_Cnt(s,"");
	    System.out.println(res);
	}
	public static int Subseq_Cnt(String s,String ans)
	{
	    if(s.length()==0)
	    {
	        System.out.println(ans);
	        return 1;
	    }
	    char ch = s.charAt(0);
	    int c1 = Subseq_Cnt(s.substring(1),ans);
	    int c2 = Subseq_Cnt(s.substring(1),ans+ch);
	    return c1+c2;
	}
}
