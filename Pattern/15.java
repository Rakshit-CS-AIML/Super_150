import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space=0;
	    int star = n;
	    int row=1;
	    while(row<=2*n-1)
	    {
	        int i=0;
	        while(i<space)
	        {
	            System.out.print("  ");
	            i++;
	        }
	        int j=1;
	        while(j<=star)
	        {
	            System.out.print("* ");
	            j++;
	        }
	        System.out.println();
	        if(row<n)
	        {
	            star--;
	            space+=2;
	        }
	        else
	        {
	            star++;
	            space-=2;
	        }
	        row++;
	    }
	}
}
