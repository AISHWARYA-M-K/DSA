class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for(int i = 0; i <= 2*n - 1; i++){
            ans[i] = nums[i % n];   
        }
        return ans;
    }
}