class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int add =0, max_value =0;
        for (int customer = 0; customer < accounts.length; customer++) {
            add =0;
            for (int bank = 0; bank < accounts[customer].length; bank++) {
                add += accounts[customer][bank];
            }
                if (add > max_value) {
                    max_value = add;
                }
        }
        return max_value;

    
    }
}