class Solution {
    public int removeDuplicates(int[] nums) {
        int freq=1;
        int n= nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                freq++;
            }else{
                freq=1;
            }
            if(freq>2){
                for(int j=i+1;j<n-1;j++){
                    nums[j]=nums[j+1];
                }
                n--;
                i--;
                freq--;
            }
        }
        return n;
    }
}