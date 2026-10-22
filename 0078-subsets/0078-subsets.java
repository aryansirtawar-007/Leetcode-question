class Solution {

    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        findSubset(nums,0,new ArrayList<>());
        return result;
        
    }

    public void findSubset(int nums[],int idx,List<Integer>temp){
        //base case
        if(idx==nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }

        //recursion
        //yess
        temp.add(nums[idx]);
        findSubset(nums,idx+1,temp);

        //while backtraking we need to remove the last added element
        temp.remove(temp.size()-1);
        //no
         findSubset(nums,idx+1,temp);

    }
}