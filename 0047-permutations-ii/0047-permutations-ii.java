class Solution {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        result.clear();
         findPermutation(nums,0);
        return result;

        
    }
    public void findPermutation(int nums[],int idx){
        //base case
        if(idx==nums.length){
           List<Integer>temp=new ArrayList<>();
            for(int num:nums){
                temp.add(num);
            }
             result.add(temp);
            return;

        }
    
        HashSet<Integer> set = new HashSet<>();
        for(int i=idx;i<nums.length;i++){

            //skip the duplicate
            if(set.contains(nums[i])){
                continue;
            }
            set.add(nums[i]);
            swap(nums,idx,i);
            findPermutation(nums,idx+1);
            swap(nums,idx,i);
        }
       
        
        
        
    }
     public void swap(int nums[],int i,int j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }

}
    