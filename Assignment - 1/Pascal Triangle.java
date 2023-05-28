/*
Take N (number of rows), print the following pattern (for N = 6)
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1

Input Format
Constraints
0 < N < 100

Output Format
Sample Input
6
Sample Output
1  
1	1  
1	2	1  
1	3	3	1  
1	4	6	4	1  
1	5	10	10	5	1
Explanation
Each number is separated from other by a tab.

*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int row=0;
		int star=1;
		while(row<n)
		{
			int i=0;
			int val=1;
			while(i<star)
			{
				System.out.print(val+" ");
				val = ((row-i) *val)/(i+1);
				i++;
			}
			star++;
			System.out.println();
			row++;
		} 

    }
}