import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
	    Maze(r,c,0,0,"");
	}
	public static void Maze(int row,int col,int c_row,int c_col,String ans)
	{
	    if(c_row==row-1 && c_col==col-1)
	    {
	        System.out.println(ans);
	        return;
	    }
	    if(c_row>=row || c_col>=col)
	    {
	        return;
	    }
	    Maze(row,col,c_row,c_col+1,ans+'H');
	    Maze(row,col,c_row+1,c_col,ans+'V');
	    
	}
}
