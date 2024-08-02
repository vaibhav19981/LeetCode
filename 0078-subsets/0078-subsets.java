class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(),nums,0);
        return ans;
        
    }

    private void backtrack(List<List<Integer>> ans,List<Integer> templist, int[]nums, int start){
        ans.add(new ArrayList<>(templist));
        for(int i=start;i<nums.length;i++){
            templist.add(nums[i]);
            backtrack(ans,templist,nums,i+1);
            templist.remove(templist.size()-1);
        }


    }
}