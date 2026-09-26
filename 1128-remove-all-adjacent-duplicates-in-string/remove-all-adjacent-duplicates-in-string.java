class Solution {
    public String removeDuplicates(String s) {
        Stack<String>stack=new Stack<>();
        String b="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(stack.isEmpty()){
                stack.push(String.valueOf(ch));}
                else{
                    if(stack.peek().equals(String.valueOf(ch))){
                    stack.pop();
                    }
                    else{
                        stack.push(String.valueOf(ch));
                    }
                    }
        }
        for(String a:stack){
            b+=a;
        }
        return b;
    }
}