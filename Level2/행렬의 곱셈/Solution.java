class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int l = arr1.length;
        int m = arr1[0].length;
        int n = arr2[0].length;
        if(m != arr2.length) System.out.println("wrong size");
        
        int[][] answer = new int[l][n];
        
        for(int i = 0 ; i < l ; i++){
            for(int j = 0 ; j < n ; j++){
                for(int k = 0 ; k < m ; k++){
                    answer[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }   
        return answer;
    }
}