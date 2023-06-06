import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i] = sc.nextInt();
	    }
	    int k = sc.nextInt();
	    int res = fun(arr,n,k,n-1);
	    System.out.println(res);
	}
	public static int fun(int[] arr,int n,int k,int idx)
	{
	    if(idx<0)
	    {
	        return -1;
	    }
	    if(arr[idx]==k)
	    {
	        return idx;
	    }
	    return fun(arr,n,k,idx-1);
	}
}
