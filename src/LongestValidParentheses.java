class Solution {
    public int longestValidParentheses(String s) {
        int maxLength = 0;
        Stack stack = new Stack();
        stack.push(-1);
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }else{
                stack.pop();
                if(stack.empty()){
                    stack.push(i);
                }else{
                    maxLength = Math.max(maxLength, i- (int)stack.peek());
                }
            }
        }
        return maxLength;
    }
}
