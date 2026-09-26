class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> a=new Stack<>();
        String b="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(!a.isEmpty()){
                b+=ch;}

                    a.push(ch);
                } 
            else if(ch==')'){
                a.pop();
                if(!a.isEmpty()){
                    b+=ch;}
                }
                  
            }
            return b;
    }
}