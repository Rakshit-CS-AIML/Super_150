import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[] = {91, 11, 13, 15, 38, 42,37};
		Stock_Span(arr);
	}
	public static void Stock_Span(int arr[])
	{
	    int ans[] = new int[arr.length];
	    Stack<Integer> st = new Stack<>();
	    for(int i=0;i<arr.length;i++)
	    {
	        while(!st.isEmpty() && arr[i]>arr[st.peek()])
	        {
	            st.pop();
	        }
	        if(st.isEmpty())
	        {
	            ans[i]=i+1;
	        }
	        else
	        {
	            ans[i]=i-st.peek();
	        }
	        st.push(i);
	    }
	    for(int i=0;i<ans.length;i++)
	    {
	        System.out.print(ans[i]+" ");
	    }
	}
}
