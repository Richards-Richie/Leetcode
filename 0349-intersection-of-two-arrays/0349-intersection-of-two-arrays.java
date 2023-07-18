class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer>hs1=new HashSet<>();
        HashSet <Integer>hs2=new HashSet<>();
        ArrayList <Integer>arr=new ArrayList<>();
        for(int i : nums1){
            hs1.add(i);
        }
        for(int i : nums2){
            hs2.add(i);
        }
        if(hs1.size() < hs2.size()){
            for(Integer i : hs1){
                if(hs2.contains(i)){
                    arr.add(i);
                }
            }
        }else{
            for(Integer i :hs2){
                if(hs1.contains(i)){
                    arr.add(i);
                }
            }
        }
        int []ans=new int[arr.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
}