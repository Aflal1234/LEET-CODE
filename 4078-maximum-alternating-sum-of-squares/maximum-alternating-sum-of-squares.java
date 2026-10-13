import java.util.*;
class Solution{
    public long maxAlternatingSum(int[] nums){
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nums[i]=-nums[i];
            }
        }
        Arrays.sort(nums);
        long sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            long a=nums[i]*nums[i];
            if(i<n/2){
                sum-=a;
            }
            else{
                sum+=a;
            }
        }
        return sum;
    }
}
