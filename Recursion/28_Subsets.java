class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> l1 = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        subset(nums,0,l1,ans);    
        return ans;    
    }
    public static void subset(int[] nums,int idx,List<Integer> l1,List<List<Integer>> ans)
    {
        if(idx==nums.length)
        {
            ans.add(new ArrayList<Integer>(l1));
            return;
        }
        l1.add(nums[idx]);
        subset(nums,idx+1,l1,ans);
        l1.remove(l1.size()-1);
        subset(nums,idx+1,l1,ans);
    }
}