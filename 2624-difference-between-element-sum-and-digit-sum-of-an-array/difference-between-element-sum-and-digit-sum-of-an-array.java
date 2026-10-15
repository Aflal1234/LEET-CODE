class Solution {
    public int differenceOfSum(int[] nums) {
        int dsum=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int temp=nums[i];
            while(temp>0) {
                dsum+=temp % 10;
                temp/=10;
            }
        }
        return Math.abs(sum-dsum);
    }
}