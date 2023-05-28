/*
Take N as input. For a value of N=7, we wish to draw the following pattern :

                            1 
                        2 1   1 2 
                    3 2 1       1 2 3 
                4 3 2 1           1 2 3 4 
                    3 2 1       1 2 3 
                        2 1   1 2 
                            1 
Input Format
Take N as input.

Constraints
N is odd number.

Output Format
Pattern should be printed with a space between every two values.

Sample Input
7
Sample Output
            1 
        2 1   1 2 
    3 2 1       1 2 3 
4 3 2 1           1 2 3 4 
    3 2 1       1 2 3 
        2 1   1 2 
            1 
Explanation
Catch the pattern and print it accordingly.

*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
	    int n= sc.nextInt();
	    int row=1;
	    int star=1;
	    int space=n-1;
	    int space2=-1;
	    int val1=row;
	    int val2=1;
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
	            System.out.print(val1+" ");
	            j++;
	            val1--;
	        }
	        int k=1;
	        while(k<=space2)
	        {
	            System.out.print("  ");
	            k++;
	        }
	        if(row!=1&&row!=n)
	        {
	            int l=1;
	            while(l<=star)
	            {
	                System.out.print(val2+" ");
	                val2++;
	                l++;
	            }
	        }
	        System.out.println();
	        if(row<=n/2)
	        {
	            space-=2;
	            space2+=2;
	            val1=row+1;
	            val2=1;
	            star++;
	        }
	        else
	        {
	            space+=2;
	            space2-=2;
	            val1=n-row;
	            val2=1;
	            star--;
	        }
	        row++;
	    }

    }
}