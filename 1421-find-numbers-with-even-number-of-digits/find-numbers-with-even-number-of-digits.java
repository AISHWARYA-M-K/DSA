class Solution {
   
    public int findNumbers(int[] nums) {
        int count = 0;
        
        for(int arr : nums){
            int no = 0;  
            while( arr > 0){
            no++;
            arr /= 10;
            }
            if(no % 2 == 0){
            count++;
            }
    }
    return count;
 }
}