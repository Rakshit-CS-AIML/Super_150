/*
Take N (number of rows), print the following pattern (for N = 4).

                       1           1
                       1 2       2 1  
                       1 2 3   3 2 1
                       1 2 3 4 3 2 1   
Input Format
Constraints
0 < N < 10

Output Format
Sample Input
4
Sample Output
1						1
1	2				2	1
1	2	3		3	2	1
1	2	3	4	3	2	1

*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst=1;
        int nsp=2*n - 3;

        int row = 1;
        while (row<=n){
            int val = 1;
	        for(int cst=1;cst<=nst;cst++){
		        System.out.print(val+" ");
		        val++;
	        }
	        for (int csp=1;csp<=nsp;csp++) {
		        System.out.print("  ");
	        }
	        int cst=1;
	        if (row==n) {
		        cst=2;
	        }
	        if(row<n) {
		        val-=1;
	        }
	        else {
		        val-=2;
	        }
	        for(;cst<=nst;cst++){
		        System.out.print(val+" ");
		        val--;
	        }

	        System.out.println();
	        row++;
	        nsp=nsp-2;
	        nst++;
        }

    }
}