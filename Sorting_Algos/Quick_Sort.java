import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {7,3,1,15,7,4};
		Quick_sort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
		{
		    System.out.print(arr[i]+" ");
		}
	}
	
	public static void Quick_sort(int arr[],int si,int ei)
	{
	    if(si>=ei)
	    {
	        return;
	    }
	    int idx = partition(arr,si,ei);
	    Quick_sort(arr,si,idx-1);
	    Quick_sort(arr,idx+1,ei);
	}
	
	public static int partition(int arr[], int si, int ei)
	{
	    int x = arr[ei];
	    int idx = si;
	    
	    for(int i=si;i<ei;i++)
	    {
	        if(arr[i]<=x)
	        {
	            int temp = arr[i];
	            arr[i] = arr[idx];
	            arr[idx] = temp;
	            idx++;
	        }
	    }
	    int temp = arr[idx];
	    arr[idx] = arr[ei];
	    arr[ei] = temp;
	    return idx;
	}
}
