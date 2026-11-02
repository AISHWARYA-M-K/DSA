class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        
        int[] row = new int[m];
        int[] col = new int[n];

        for(int[] a: indices){
            row[a[0]]++;
            col[a[1]]++;
        }
        int res = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if((row[i] + col[j]) % 2 != 0)
                res++;
            }
        }
        return res;

    }
}