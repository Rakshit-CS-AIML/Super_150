/*
Take N (number of rows), print the following pattern (for N = 4).

                       1 
                     2 3 2
                   3 4 5 4 3
                 4 5 6 7 6 5 4
Input Format
Constraints
0 < N < 10

Output Format
Sample Input
4
Sample Output
                        1
		2	3	2
	3	4	5	4	3
4	5	6	7	6	5	4
Explanation
Each number is separated from other by a tab.

*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int row = 1;
		int space = n-1;
		int star = 1;
		while(row<=n)
		{	
			int i=1;
			while(i<=space)
			{
				System.out.print("  ");
				i++;
			}
			int j=1;
			int var=row;
			while(j<=star)
			{
				System.out.print(var+" ");
				if(j<=star/2)
				{
					var++;
				}
				else
				{
					var--;
				}
				j++;
			}
			System.out.println();
			space--;
			star+=2;
			row++;
		}
	}
}