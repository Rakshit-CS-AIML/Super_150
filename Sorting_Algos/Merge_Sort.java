import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {7,3,1,15,7,1};
		int ans[] = merge_sort(arr,0,arr.length-1);
		for(int i=0;i<ans.length;i++)
		{
		    System.out.print(ans[i]+" ");
		}
	}
	
	public static int[] merge_sort(int arr[],int lo,int hi)
	{
	    if(lo==hi)
	    {
	        int ans[]=new int[1];
	        ans[0]=arr[lo];
	        return ans;
	    }
	    int mid=(lo+hi)/2;
	    int arr1[] = merge_sort(arr,lo,mid);
	    int arr2[] = merge_sort(arr,mid+1,hi);
	    return fun(arr1,arr2);
	}
	
	public static int[] fun(int arr1[],int arr2[])
	{
	    int i=0;
	    int j=0;
	    int k=0;
	    int m=arr1.length;
	    int n=arr2.length;
	    int ans[] = new int[m+n];
	    while(i<m && j<n)
	    {
	        if(arr1[i]<=arr2[j])
	        {
	            ans[k]=arr1[i];
	            i++;
	            k++;
	        }
	        else
	        {
	            ans[k]=arr2[j];
	            j++;
	            k++;
	        }
	    }
	    while(i<m)
	    {
	        ans[k++]=arr1[i++];
	    }
	    while(j<n)
	    {
	        ans[k++]=arr2[j++];
	    }
	    return ans;
	}
}
