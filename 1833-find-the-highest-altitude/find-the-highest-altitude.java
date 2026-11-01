class Solution {
    public int largestAltitude(int[] gain) {
        int netGain = 0; 
        int[] result = new int[gain.length];
        int max_value =0;
        for(int i = 0; i < gain.length; i++){
            netGain += gain[i];
            result[i] = netGain; 
        }

        for(int j = 0 ; j < gain.length; j++){
            if(max_value < result[j]){
                max_value = result[j];
            }
        }

        return max_value;
    }
}