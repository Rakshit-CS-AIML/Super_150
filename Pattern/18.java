import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space= n/2;
	    int star = 1;
	    int row=1;
	    while(row<=n)
	    {
	        int i=1;
	        while(i<=space)
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
	        if(row<=n/2)
	        {
	            star+=2;
	            space--;
	        }
	        else
	        {
	            star-=2;
	            space++;
	        }
	        row++;
	    }
	}
}
