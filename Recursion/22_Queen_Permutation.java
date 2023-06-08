import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tq = sc.nextInt();
		boolean board[] = new boolean[n];
	    Queen_Permutation(board,n,tq,0,"");
	}
	public static void Queen_Permutation(boolean[] board,int n,int tq,int qpsf,String ans)
	{
	    if(qpsf==tq)
	    {
	        System.out.println(ans);
	        return;
	    }
	    for(int i=0;i<n;i++)
	    {
	        if(board[i]==false)
	        {
	            board[i]=true;
	            Queen_Permutation(board,n,tq,qpsf+1,ans+"b"+i+"q"+qpsf);
	            board[i]=false;
	        }
	    }
	}
}
