class Solution {
    public int majorityElement(int[] nums) {
        int ans=-1;
        if(nums.length == 1){
            return nums[0];
        }
        HashMap <Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            if(hm.get(nums[i]) > (nums.length/2)){
                ans=nums[i];
            }
        }
        return ans;
    }
}