import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[] = {11, 3, 23, 9, 15};
		NGE(arr);
	}
	public static void NGE(int arr[])
	{
	    int ans[] = new int[arr.length];
	    Stack<Integer> st = new Stack<>();
	    for(int i=0;i<arr.length;i++)
	    {
	        while(!st.isEmpty() && arr[i]>arr[st.peek()])
	        {
	            int temp = st.pop();
	            ans[temp]=arr[i];
	        }
	        st.push(i);
	    }
	    while(!st.isEmpty())
	    {
	        int temp=st.pop();
	        ans[temp]=-1;
	    }
	    for(int i=0;i<ans.length;i++)
	    {
	        System.out.print(ans[i]+" ");
	    }
	}
}
