class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp1=num;
        int rev1=0;
        int rev2=0;
        while(temp1>0){
            int rem1=temp1%10;
            rev1=rev1*10+rem1;
            temp1=temp1/10;
            
        }
        int temp2=rev1;
        while(temp2>0){
            int rem2=temp2%10;
            rev2=rev2*10+rem2;
            temp2=temp2/10;
        }
        if(rev2==num){
            return true;
        }
        else{
            return false;
        }
    }
}