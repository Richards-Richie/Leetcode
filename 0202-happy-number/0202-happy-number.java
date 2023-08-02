class Solution {
    public boolean isHappy(int n) {
        int temp=n;
        HashSet <Integer>hs=new HashSet<>();
        if(n == 1 ){
            return true;
        }

        while(temp!=1){
            if(hs.contains(temp)){
                return false;
            }
            hs.add(temp);
            
            temp=getValue(temp);
           
        }
        return true;
        
    }
    public int getValue(int a){
        int temp1=0;
        while(a!=0){
            temp1+=Math.pow(a%10,2);
            a=a/10;
        }
        return temp1;
    }
}