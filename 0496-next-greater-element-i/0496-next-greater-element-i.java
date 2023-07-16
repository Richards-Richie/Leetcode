class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int []ans=new int[nums1.length];
        HashMap <Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            hm.put(nums2[i],i);
        }
        for(int i=0;i<nums1.length;i++){
            if(hm.containsKey(nums1[i])){
                ans[i]=search(hm.get(nums1[i]),nums2);
            }else{
                ans[i]=-1;
            }
        }
        return ans;

    }
    public int search(int target,int []nums2){
        for(int i=target;i<nums2.length;i++){
            if(nums2[i]>nums2[target]){
                return nums2[i];
            }
        }
        return -1;
    }
}