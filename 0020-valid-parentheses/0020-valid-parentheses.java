class Solution {
    public boolean isValid(String s) {
        Stack<Character> sb=new Stack<>();
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(curr=='('||curr=='{'||curr=='['){
                sb.push(curr);
            }else{
                if(sb.isEmpty()){
                    return false;
                }
                if((sb.peek()=='('&& curr==')')
                ||( sb.peek()=='{' && curr=='}')
                ||(sb.peek()=='['&& curr==']')){
                    sb.pop();
                }else{
                    return false;
                }
            }


        }
        if(sb.isEmpty()){
            return true;
        }else{
            return false;
        }


    }
}