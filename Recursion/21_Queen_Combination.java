import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tq = sc.nextInt();
		boolean board[] = new boolean[n];
	    Queen_Combination(board,n,tq,0,"",0);
	}
	public static void Queen_Combination(boolean[] board,int n,int tq,int qpsf,String ans,int idx)
	{
	    if(qpsf==tq)
	    {
	        System.out.println(ans);
	        return;
	    }
	    for(int i=idx;i<n;i++)
	    {
	        if(board[i]==false)
	        {
	            board[i]=true;
	            Queen_Combination(board,n,tq,qpsf+1,ans+"b"+i+"q"+qpsf,idx+1);
	            board[i]=false;
	        }
	    }
	    
	}
}
