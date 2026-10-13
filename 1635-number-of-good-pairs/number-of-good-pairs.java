class Solution {
    public int numIdenticalPairs(int[] nums) {
    int count =0,i =0;
        while(i < nums.length){
       for(int j = i+1; j < nums.length; j++){
        if(nums[i] == nums[j] && i < j){
            count++;
        }
       } 
       i++;
        }
       return count;
    }
}