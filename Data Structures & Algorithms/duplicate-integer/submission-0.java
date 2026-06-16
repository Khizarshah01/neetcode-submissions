class Solution {
    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i<nums.length; i++){
            int check = 0;
            for (int j = 0; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    check++;
                }
                if(check==2) return true;
            }

            check = 0;
        }
        return false;
    }
}