class Solution {
    public List<List<String>> partition(String s) {
        List<String> l1 = new ArrayList<>();
        List<List<String>> l2 = new ArrayList<>();
        fun(s,l1,l2);
        return l2;
    }

    public static void fun(String s,List<String> l1,List<List<String>> l2)
    {
        if(s.length()==0)
        {
            l2.add(new ArrayList(l1));
            return;
        }
        for(int i=1;i<=s.length();i++)
        {
            String part = s.substring(0,i);
            if(ispal(part)==true)
            {
                l1.add(part);
                fun(s.substring(i),l1,l2);
                l1.remove(l1.size()-1);
            }
        }
    }
   
    public static boolean ispal(String part) {
		int i = 0;
		int j = part.length() - 1;
		while (i < j) {
			if (part.charAt(i) != part.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}