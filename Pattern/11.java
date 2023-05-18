import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=0;
		int star = 1;
		int space=n-1;
		while(row<n)
		{
		    int i=0;
		    while(i<space)
		    {
		        System.out.print(" ");
		        i++;
		    }
		    int j=0;
		    while(j<star)
		    {
		        if(j%2==0)
		        {
		            System.out.print("*");
		        }
		        else
		        {
		            System.out.print(" ");
		        }
		        j++;
		    }
		    System.out.println();
		    row++;
		    space--;
		    star+=2;
		}
		
	}
}
