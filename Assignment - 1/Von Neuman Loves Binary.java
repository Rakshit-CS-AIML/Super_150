/*
Given a binary number ,help Von Neuman to find out its decimal representation. For eg 000111 in binary is 7 in decimal.

Input Format
The first line contains N , the number of binary numbers. Next N lines contain N integers each representing binary represenation of number.

Constraints
N<=1000 Digits in binary representation is <=16.

Output Format
N lines,each containing a decimal equivalent of the binary number.

Sample Input
4
101
1111
00110
111111
Sample Output
5
15
6
63
Explanation
For binary number fedcba , Decimal number = f * 25 + e * 24 + d * 23 + …..+ a * 20.
*/

import java.util.*;
public class Main 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            int res=0;
            int pr=1;
            while(arr[j]>0)
            {
                int dig = arr[j]%10;
                res += pr*dig;
                arr[j]/=10;
                pr *= 2;
            }
            System.out.println(res);
        }
         

    }
}