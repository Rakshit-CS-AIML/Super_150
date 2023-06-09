import java.util.*;
public class Main
{
    static boolean flag=false;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		char maze[][] = new char[m][n];
		for(int i=0;i<m;i++)
		{
		    String temp = sc.next();
		    for(int j=0;j<n;j++)
		    {
		        maze[i][j]=temp.charAt(j);
		    }
		}
		int ans[][] = new int[m][n];
		Rat_Chases(maze,m,n,0,0,ans);
		if(flag==false)
		{
		    System.out.println("No Path Found");
		}
	}
	
	public static void Rat_Chases(char[][] maze,int m,int n,int cr,int cc,int ans[][])
	{
	    if(cr==m-1 && cc==n-1 && maze[cr][cc]!='X')
	    {
	        ans[cr][cc]=1;
	        flag=true;
	        display(ans);
	        return;
	    }
	    if(cr<0 || cr>=m || cc<0 || cc>=n || maze[cr][cc]=='X')
	    {
	        return;
	    }
	    
	    maze[cr][cc]='X';
	    ans[cr][cc]=1;
	    int r[] = {0,-1,0,1};
	    int c[] = {1,0,-1,0};
	    
	    
	    for(int i=0;i<c.length;i++)
	    {
	        Rat_Chases(maze,m,n,cr+r[i],cc+c[i],ans);
	    }
	    
	    maze[cr][cc]='O';
	    ans[cr][cc]=0;
	}
	
	public static void display(int ans[][])
	{
	    for(int i=0;i<ans.length;i++)
	    {
	        for(int j=0;j<ans[0].length;j++)
	        {
	            System.out.print(ans[i][j]+" ");
	        }
	        System.out.println();
	    }
	}
}
