import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
	    Permutation(s,"");
	}
	public static void Permutation(String ques,String ans)
	{
	    if(ques.length()==0)
	    {
	        System.out.println(ans);
	        return;
	    }
	    for(int i=0;i<ques.length();i++)
	    {
	        boolean flag=true;
	        char ch = ques.charAt(i);
	        for(int j=i+1;j<ques.length();j++)
	        {
	            if(ch==ques.charAt(j))
	            {
	                flag=false;
	                break;
	            }
	        }
	    }
	    if(flag==true)
	    {
	       String s1 = ques.substring(0,i);
	       String s2 = ques.substring(i+1);
	       Permutation(s1+s2,ans+ch);
	    }
	}
}
