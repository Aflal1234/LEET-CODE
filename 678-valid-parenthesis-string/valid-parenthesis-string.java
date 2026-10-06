class Solution {
    public boolean checkValidString(String s) {
        int ocount=0,scount=0,ccount=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(')ocount++;
            if(ch==')')ccount++;
            if(ch=='*')scount++;
            if(ccount>ocount+scount){
                return false;
        }
        }
        ocount=0;scount=0;ccount=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='(')ocount++;
            if(ch==')')ccount++;
            if(ch=='*')scount++;
            if(ocount>ccount+scount){
                return false;
        }
        }
        return true;
    }
}