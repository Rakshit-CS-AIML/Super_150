/*
Take N as input. Print Nth Fibonacci Number, given that the first two numbers in the Fibonacci Series are 0 and 1.

Input Format
Constraints
0 <= N <= 1000

Output Format
Sample Input
10
Sample Output
55
Explanation
The 0th fibonnaci is 0 and 1st fibonnaci is 1.

*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int a=0;
        int b=1;
        int x=0;
        for(int i=0;i<n-1;i++)
        {
            x=a+b;
            a=b;
            b=x;
        }
        System.out.println(x);

    }
}