class Solution { 
    public int[] maxDepthAfterSplit(String seq) { 
        int depth=-1;
        int []arr =new int[seq.length()];
        for(int i=0;i<seq.length();i++){
            char ch=seq.charAt(i);
            if(ch=='('){
                depth+=1;
                arr[i]=depth%2;
            }
            else if(ch==')'){
                arr[i]=depth%2;
                depth-=1;
            }
        }
        return arr;
    }
}