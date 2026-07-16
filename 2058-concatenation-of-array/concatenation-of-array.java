class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr=new int[nums.length*2];
        for(int i=0;i<arr.length;i++){
            int a=i%nums.length;
            arr[i]=nums[a];
        }
        return arr;
    }
}