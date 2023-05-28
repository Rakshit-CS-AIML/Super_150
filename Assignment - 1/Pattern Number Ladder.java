/*
Take N (number of rows), print the following pattern (for N = 4)

1
2 3
4 5 6
7 8 9 10

Input Format
Constraints
0 < N < 100

Output Format
Sample Input
4
Sample Output
1  
2	3  
4	5	6  
7	8	9	10
Explanation
Each number is separated from other by a tab.
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int i =1;
        int star=1;
        int var=1;
        while(i<=rows)
        {
            int j=1;
            while(j<=star)
            {
                System.out.print(var+"  ");
                var++;
                j++;
            }
            System.out.println();
            i++;
            star++;
        }
    }
}
