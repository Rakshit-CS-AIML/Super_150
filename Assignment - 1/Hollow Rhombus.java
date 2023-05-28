/*
Given number of rows N, you have to print a Hollow Rhombus. See the output for corresponding given input.

Input Format
Single integer N.

Constraints
N <= 20

Output Format
Print pattern.

Sample Input
5
Sample Output
    *****
   *   *
  *   *
 *   *
*****
Explanation
For any input N. First line contains 4 space and then 5 {*} and then the second line contains according to the output format.
*/


import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows;
        rows = sc.nextInt();
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=rows-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=rows;k++)
            {
                if(k==1||k==rows||i==1||i==rows)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}