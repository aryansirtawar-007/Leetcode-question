class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=firstOccurance(nums,target);
        int last=lastOccurance(nums,target);
        return new int[]{first,last};

    }
    public int firstOccurance(int []nums,int target){
        int st=0;
        int end=nums.length-1;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]==target){
                ans=mid;
                end=mid-1;
            }else if(nums[mid]<target){
                st=mid+1;

            }else{
                end=mid-1;
            }
     }
      return ans;
   
    }

    public int lastOccurance(int []nums,int target){
        int st=0;
        int end=nums.length-1;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]==target){
                ans=mid;
                st=mid+1;
            }else if(nums[mid]<target){
                st=mid+1;

            }else{
                end=mid-1;
            }
           }
    return ans;
    }
    
    



}