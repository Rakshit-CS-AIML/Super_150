import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=0;
		while(row<n)
		{
		    int col=0;
		    while(col<n-row)
		    {
		        System.out.print("*");
		        col++;
		    }
		    System.out.println();
		    row++;
		}
		
	}
}


