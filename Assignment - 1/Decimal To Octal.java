/*
Take N (number in decimal format). Write a function that converts it to octal format. Print the value returned.

Input Format
Constraints
0 < N <= 1000000000

Output Format
Sample Input
63
Sample Output
77
Explanation
Both input and output are integers

*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int out1 = dectooct(n);
        System.out.println(out1);
    }
    public static int dectooct(int n)
    {
        int ans=0;
        while(n>0)
        {
            int dig = n%8;
            ans = 10*ans+dig;
            n/=8;
        }
        int out = reverse(ans);
        return out;
    }
    public static int reverse(int ans)
    {
        int a = 0;
        while(ans>0)
        {
            int d=ans%10;
            a = a*10+d;
            ans/=10;
        }
        return a;
    }
}
