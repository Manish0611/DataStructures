class Solution {
    public int maxProfit(int[] nums) {
      int cur=nums[0];
      int max=0;
      for(int i=1;i<nums.length;i++){
          if(nums[i]<cur){
              cur=nums[i];
          }
          else{
              int curr=nums[i]-cur;
              max=Math.max(curr,max);
          }
      } return max; }
     
}