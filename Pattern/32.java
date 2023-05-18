import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int row=1;
	    int star=1;
	    int x=1;
	    int col=1;
	    while(row<=2*n-1)
	    {
	        int j=1;
	        while(j<=col)
	        {
	            if(j%2!=0)
	                System.out.print(x+" ");
	            else
	                System.out.print("* ");
	            j++;
	        }
	        System.out.println();
	        if(row<n)
	        {
	            star+=2;
	            x++;
	            col+=2;
	        }
	        else
	        {
	            star-=2;
	            x--;
	            col-=2;
	        }
	        row++;
	    }
	}
}
