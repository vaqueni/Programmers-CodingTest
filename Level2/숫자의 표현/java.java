class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = i + 1;
        }
        int start = 0 ; 
        int end = 0; // end < arr.length 여야만 한다.
        
        while(end < arr.length){
            int SUM = sum(arr, start, end);
            if(SUM < n){
                end++;
            }else if(SUM > n){
                start++;
            }else{
                answer++;
                end++;
            }
        }

        for(int i = 0 ; i < arr.length ; i++){

        }
        return answer;
    }

    int sum(int[] arr, int start, int end){
        int output =0;
        for(int i = start ; i < end + 1 ; i++){
            output += arr[i];
        }
        return output;
    }
    public static void main(String[] args) {
        int n = 15;
        Solution sol = new Solution();
        System.out.println(sol.solution(n));
    }
}
