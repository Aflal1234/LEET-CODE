class Solution {
    public int maxDepth(String s) {
        int count=0;
        int depth=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                depth+=1;
            }
            else if(ch==')'){
                depth-=1;
            }
            if(depth>max){
                max=depth;
            }
        }
        return max;
    }
}