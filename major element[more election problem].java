class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==0){return 0;}
        int ma=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==ma){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                ma=nums[i];
                count=1;
            }
        }
        return ma;}
}