import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int row=1;
	    while(row<=n)
	    {
	        int temp=n; 
	        int col=1;
	        while(col<=n)
	        {
	            if(row+col==n+1)
	                System.out.print("* ");
	            else
	                System.out.print(temp+" ");
	            temp--;
	            col++;
	        }
	        System.out.println();
	        row++;
	    }
	}
}
