class Solution {
    public long solution(int n) {
        int count[] = new int[2002];
        count[0] = 0;
        count[1] = 1;
        count[2] = 2;
        for(int i = 3 ; i < n + 1 ; i++){
            count[i] = (count[i-1] + count[i-2]) % 1234567;
        }
        return count[n];
    }
}