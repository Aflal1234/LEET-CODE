class Solution {
    public int minimumDeletions(int[] nums) {
        int min=0;
        int min_value=Integer.MAX_VALUE;
        int max=0;
        int max_value=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min_value){
                min_value=nums[i];
                min=i;
            }
            if(nums[i]>max_value){
                max_value=nums[i];
                max=i;
            }
        }
        int a=Math.min(min,max);
        int b=Math.max(min,max);
        int front=b+1;
        int back=nums.length-a;
        int both=a+1+nums.length-b;
        return Math.min(front,Math.min(back,both));
    }
}