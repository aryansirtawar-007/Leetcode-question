class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> sb=new Stack<>();
        sb.push(-1);
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                sb.push(i);
            }else{
                sb.pop();
                if(sb.isEmpty()){
                    sb.push(i);

                }else{
                    max=Math.max(max,i-sb.peek());
                }
            }
        }

        return max;
    }
}
