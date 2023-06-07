import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    TOH(n,"A","B","C");
	}
	public static void TOH(int n,String src,String hlp,String des)
	{
	    if(n==0)
	    {
	        return;
	    }
	    TOH(n-1,src,des,hlp);
	    System.out.println("Move "+n+"th "+" disc from "+src+" to "+des);
	    TOH(n-1,hlp,src,des);
	    
	}
}
