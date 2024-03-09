class Solution {
    public int removeDuplicates(int[] nums) {
    if(nums.length==0){return 0;}
    int count=1;
    int slow=0;
    for(int fast=1;fast<nums.length;fast++){
        if(nums[fast]==nums[fast-1]){
            count++;
        }
        else{
            count=1;
        }
        if(count<=2){
            slow++;
            nums[slow]=nums[fast];
            
        }
    }return slow+1;
}
}