/*
You will be given a number N. You have to code a hollow diamond looking pattern.

The output for N=5 is given in the following image.

*********
**** ****
***   ***
**     **
*       *
**     **
***   ***
**** ****
*********  

Input Format
The input has only one single integer N.

Constraints
Output Format
Output the given pattern.

Sample Input
Sample Output
Explanation
Write a code to print above given pattern. No space between any two characters.

*/

import java.util.*;
public class Main {
    public static void main (String args[]) 
    {
        Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int row = 1;
		int space = -1;
		int star = n ;
		while(row<=2*n-1)
		{
			int i=1;
			while(i<=star)
			{
				System.out.print("*");
				i++;
			}
			int j=1;
			while(j<=space)
			{
				System.out.print(" ");
				j++;
			}
			int k=1;
			if(row==1 || row==2*n-1)
			{
				k=2;
			}
			while(k<=star)
			{
				System.out.print("*");
				k++;
			}
			if(row<n)
			{
				star--;
				space += 2;
				
			}
			else
			{
				star++;
				space -= 2;
			}
			System.out.println();
			row++;		
		}

    }
}