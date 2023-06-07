import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Coin_Toss(n,"");
	}
	public static void Coin_Toss(int n,String ans)
	{
	    if(n==0)
	    {
	        System.out.println(ans);
	        return;
	    }
	    if(ans.length()==0 || ans.charAt(ans.length()-1)!='H')
	    {
	        Coin_Toss(n-1,ans+'H');
	    }
	    Coin_Toss(n-1,ans+'T');
	}
}
