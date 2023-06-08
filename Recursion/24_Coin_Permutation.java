import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		int coin[] = {2,3,5};
	    Coin_Permutation(coin,target,"");
	}
	public static void Coin_Permutation(int[] coin,int target,String ans)
	{
	    if(target==0)
	    {
	        System.out.println(ans);
	        return;
	    }
	    for(int i=0;i<coin.length;i++)
	    {
	        if(target>=coin[i])
	        {
	            Coin_Permutation(coin,target-coin[i],ans+coin[i]);
	        }
	    }
	}
}
