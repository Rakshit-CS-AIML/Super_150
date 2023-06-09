import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String_Partitioning(s,"");
	}
	
	public static void String_Partitioning(String ques,String ans)
	{
	    if(ques.length()==0)
	    {
	        System.out.println(ans);
	        return;
	    }
	    for(int i=1;i<=ques.length();i++)
	    {
	        String_Partitioning(ques.substring(i),ans+ques.substring(0,i)+"|");
	    }
	}
}
