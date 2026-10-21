class Solution {
    public int firstUniqChar(String s) {
        int freq[]=new int[26];
        Queue<Integer> q=new LinkedList<>();
        int ans=-1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
          
            freq[ch-'a']++;
            q.add(i);
            while(!q.isEmpty() && freq[s.charAt(q.peek())-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                ans=-1;
            }else{
                ans=q.peek();
            }

        }
        return ans;
    }
}