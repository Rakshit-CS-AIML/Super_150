import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space=n-1;
		int col=1;
		while(row<=n)
		{
		    int i=1;
		    while(i<=space)
		    {
		        System.out.print("  ");
		        i++;
		    }
		    int j=1;
		    int x1=n-row+1;
		    int x2=n-1;
		    while(j<=col/2)
		    {
		        System.out.print(x1+" ");
		        j++;
		        x1++;
		    }
		    System.out.print(0+" ");
		    while(j<col)
		    {
		        System.out.print(x2+" ");
		        j++;
		        x2--;
		    }
		    System.out.println();
		    row++;
		    col+=2;
		    space--;
		}
	}
}



