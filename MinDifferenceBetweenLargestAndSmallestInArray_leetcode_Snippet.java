class Solution {
    public int minDifference(int[] nums) {
        if(nums.length<=4)
            return 0;
        else
        {
            Arrays.sort(nums);
            int minimumDifference = Integer.MAX_VALUE;
            for (int i = 0; i <= 3; i++) {
                minimumDifference = Math.min(minimumDifference, nums[nums.length - 1 - (3 - i)] - nums[i]);
            }
            return minimumDifference;
        }
    }
}
