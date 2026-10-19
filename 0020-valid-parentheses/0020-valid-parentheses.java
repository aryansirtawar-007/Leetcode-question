class Solution {
    public boolean isValid(String s) {
        Stack<Character> sb=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='['|| ch=='{'){
                sb.push(ch);
            }else{
                if(sb.isEmpty()){
                    return false;
                }else{
                    if((sb.peek()=='(' && ch==')') || (sb.peek()=='[' && ch==']') || (sb.peek()=='{' && ch=='}')){
                        sb.pop();
                    }else{
                        return false;
                    }
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