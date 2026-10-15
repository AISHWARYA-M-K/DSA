class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int i = 0;
        int r = 0;
        int[] result = new int[nums.length];
        while(i < nums.length){
            for(int j = 0; j < nums.length; j++){
                if(nums[j] != nums[i] && nums[j] < nums[i]){
                    r++;
                }
            }
            result[i] = r;
            r = 0;
            i++;
        }
        return result;
    }
}