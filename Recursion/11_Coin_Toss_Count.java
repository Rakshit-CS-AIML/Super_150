import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = Coin_Toss(n,"");
		System.out.println(res);
	}
	public static int Coin_Toss(int n,String ans)
	{
	    if(n==0)
	    {
	        System.out.println(ans);
	        return 1;
	    }
	    int c1 = Coin_Toss(n-1,ans+'H');
	    int c2 = Coin_Toss(n-1,ans+'T');
	    return c1+c2;
	}
}
