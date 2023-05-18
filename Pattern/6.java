import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=0;
		int x=0;
		while(row<n)
		{
		    int i=0;
		    int j=0;
		    while(j<x)
		    {
		        System.out.print(" ");
		        j++;
		    }
		    while(i<n-row)
		    {
		        System.out.print("*");
		        i++;
		    }
		    System.out.println();
		    x+=2;
		    row++;
		}
	}
}

