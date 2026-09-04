class Solution {
    public int missingMultiple(int[] nums, int k) {
        int a=k;
        int b=0;
        while(a!=0){
            boolean c=false;
            for(int i=0;i<nums.length;i++){
                if(a==nums[i]){
                    c=true;
                    break;
                }}
                if(!c){
                    b=a;
                    a=0;
                    break;
                }
                a+=k;
        }
        return b;
    }
}