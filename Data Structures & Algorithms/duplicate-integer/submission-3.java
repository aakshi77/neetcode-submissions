class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }
        }
        if(count>=1){
            return true;
        }
        return false;
    }
}