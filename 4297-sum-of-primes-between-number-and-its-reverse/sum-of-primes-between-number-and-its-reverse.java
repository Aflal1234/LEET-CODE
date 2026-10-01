class Solution {
    public int sumOfPrimesInRange(int n) {
        int temp=n;
        int sum=0;
        int rev=0;
        while(temp>0){
                int rem=temp%10;
                rev=rev*10+rem;
                temp=temp/10;
        }
        for(int i=Math.min(n,rev);i<=Math.max(n,rev);i++){
            int count=0;
            for(int j=1;j<=i/2;j++){
                if(i%j==0){
                    count+=1;
                }
            }
            if(count==1){
                sum+=i;
            }
        }
        return sum;
    }
}