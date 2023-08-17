class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []ans=new int[2];
        
        HashMap <Integer,Integer>hs=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            int ans1=hs.getOrDefault(diff,-1);
            if(ans1!=-1 && ans1!=i){
                ans[0]=i;
                ans[1]=ans1;
                return ans;
            }
        }
        return ans;
    }
}