import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String str = "DDIIDIDD";
		fun(str);
	}
	public static void fun(String str)
	{
	    Stack<Integer> st = new Stack<>();
	    int ans[] = new int[str.length()+1];
	    int c=1;
	    for(int i=0;i<=str.length();i++)
	    {
	        if(i==str.length() || str.charAt(i)=='I')
	        {
	            ans[i]=c;
	            c++;
	            while(!st.isEmpty())
	            {
	                ans[st.pop()]=c;
	                c++;
	            }
	        }
	        else
	        {
	            st.push(i);
	        }
	    }
	    for(int i=0;i<ans.length;i++)
	    {
	        System.out.print(ans[i]+" ");
	    }
	}
}
