import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Boardpath(n,0,"");
	}
	public static void Boardpath(int n,int curr,String ans)
	{
	    if(curr==n)
	    {
	        System.out.println(ans);
	        return;
	    }
	    if(curr>n)
	    {
	        return;
	    }
	    for(int i=1;i<4;i++)
	    {
	        Boardpath(n,curr+i,ans+i);
	    }
	}
}
