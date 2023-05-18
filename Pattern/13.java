import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int star = 1;
	    int row=1;
	    while(row<=2*n-1)
	    {
	        int i=1;
	        while(i<=star)
	        {
	            System.out.print("* ");
	            i++;
	        }
	        System.out.println();
	        if(row<n)
	        {
	            star++;
	        }
	        else
	        {
	            star--;
	        }
	        row++;
	    }
	}
}
