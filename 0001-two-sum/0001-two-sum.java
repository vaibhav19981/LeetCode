class Solution {
    public int[] twoSum(int[] nums, int target) {

        int count = 0;
        int[] indices = new int[2];
        for(int k:nums){
        count++;

        }
        for(int i=0;i<count;i++){
            for(int j=i+1;j<count;j++){
                if(nums[i]+nums[j]==target){
            indices[0]=i;
            indices[1]=j;
                }
            }
        }
        return indices;
    }
}