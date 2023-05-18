import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=0;
		while(row<n)
		{
		    int space=0;
		    int star=0;
		    while(space<n-row-1)
		    {
		        System.out.print(" ");
		        space++;
		    }
		    while(star<row+1)
		    {
		        System.out.print("*");
		        star++;
		    }
		    System.out.println();
		    row++;
		}
		
	}
}

