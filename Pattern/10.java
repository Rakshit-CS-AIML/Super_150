import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=0;
		int star=2*n-1;
		while(row<n)
		{
		    int space=0;
		    int j=star;
		    while(space<row)
		    {
		        System.out.print(" ");
		        space++;
		    }
		    while(j>0)
		    {
		        System.out.print("*");
		        j--;
		    }
		    System.out.println();
		    star-=2;
		    row++;
		}
	}
}


