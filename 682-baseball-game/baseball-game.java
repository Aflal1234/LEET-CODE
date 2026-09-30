class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        int sum=0;
      for(int i=0;i<operations.length;i++){
            String s=operations[i];
            if(s.equals("C")){
                stack.pop();
            }
            else if(s.equals("D")){
                int a=stack.peek()*2;
                stack.push(a);
            }
            else if(s.equals("+")){
                int b=stack.pop();
                int c=stack.peek()+b;
                stack.push(b);
                stack.push(c);
            }
            else{
                stack.push(Integer.parseInt(s));
            }
        }
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }
}