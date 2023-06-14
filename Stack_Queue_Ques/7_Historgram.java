import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[] = {2,1,5,6,2,3};
		int ans = Histogram(arr);
		System.out.println(ans);
	}
	public static int Histogram(int[] heights)
	{
	    int n = heights.length;
        int ans = 0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && heights[i]<heights[st.peek()])
            {
                int r=i;
                int h = heights[st.pop()];
                if(st.isEmpty())
                {
                    ans = Math.max(ans,h*r);
                }
                else
                {
                    int l= st.peek();
                    ans = Math.max(ans,h*(r-l-1));
                }
            }
            st.push(i);
        }  
        int r=n;
        while(!st.isEmpty())
        {
            int h = heights[st.pop()];
            if(st.isEmpty())
            {
                ans = Math.max(ans,h*r);
            }
            else
            {
                int l=st.peek();
                ans=Math.max(ans,h*(r-l-1));
            }
        }
        return ans;
	}
}
