import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=0;
		while(row<n)
		{
		    int i=0;
		    int j=0;
		    while(i<n-row)
		    {
		        System.out.print(" ");
		        i++;
		    }
		    while(j<2*row+1)
		    {
		        System.out.print("*");
		        j++;
		    }
		    System.out.println();
		    row++;
		}
	}
}

