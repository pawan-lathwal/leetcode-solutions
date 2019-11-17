class Solution {
    public boolean canJump(int[] nums) {
        if(nums == null || nums.length < 2) {
            return true;
        }

        int n = nums.length;
        int lastIdx = n-1;
        for(int i=n-2; i>=0; i--) {
            if(i + nums[i] >= lastIdx) {
                lastIdx = i;
            }
        }
        return lastIdx==0;
    }
}
