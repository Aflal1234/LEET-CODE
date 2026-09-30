class Solution {
    public String clearDigits(String s) {
        char [] arr=s.toCharArray();
        Stack<Character>stack=new Stack<>();
        String a="";
        for(int i=0;i<s.length();i++){
            char ch=arr[i];
            if(Character.isLetter(ch)){
                stack.push(ch);
            }
            else{
                if(!stack.isEmpty()){
                stack.pop();
                }
            }
        }
        for(char ch:stack){
            a+=ch;
        }
        return a;
    }
}