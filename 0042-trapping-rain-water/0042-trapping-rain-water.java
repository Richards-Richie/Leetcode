class Solution {
    public int trap(int[] arr) {
        int twl=0;
        Stack <Integer>s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            int twl1=0;
            while(s.size() >0 && arr[s.peek()] < arr[i]){
                int rm=i;
                int cur=s.pop();
                if(s.size() == 0){
                    break;
                }
                int lm=s.peek();
                int width=rm-lm-1;
                twl1+=( Math.min(arr[rm],arr[lm])-arr[cur])*width;
            }
            s.push(i);
            twl+=twl1;
        }
        return twl;
    }
}