/*
Take N (number of rows - only odd numbers allowed), print the following pattern (for N = 5).

      *
   *  *  *  
*  *  *  *  *  
   *  *  *
      *
Input Format
Constraints
0 < N < 10 (only odd numbers allowed)

Output Format
Sample Input
5
Sample Output
      *
    * * *
  * * * * *
    * * *
      *
Explanation
Each '*' is separated from other by a tab.

*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int i=1;
        int space=rows/2;
        int star=1;
        while(i<=rows)
        {
            int j=1;
            while(j<=space)
            {
                System.out.print("  ");
                j++;
            }
            int k=1;
            while(k<=star)
            {
                System.out.print("* ");
                k++;
            }
            if(i<=rows/2)
            {
                space--;
                star+=2;
            }
            else
            {
                space++;
                star-=2;
            }
            System.out.println();
            i++;

        }
        
    }
}