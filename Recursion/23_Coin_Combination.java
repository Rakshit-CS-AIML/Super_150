import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		int coin[] = {2,3,5};
	    Coin_Combination(coin,target,0,"");
	}
	public static void Coin_Combination(int[] coin,int target,int idx,String ans)
	{
	    if(target==0)
	    {
	        System.out.println(ans);
	        return;
	    }
	    for(int i=idx;i<coin.length;i++)
	    {
	        if(target>=coin[i])
	        {
	            Coin_Combination(coin,target-coin[i],i,ans+coin[i]);
	        }
	    }
	}
}
