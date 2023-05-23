class Solution {
    public int solution(int n) {
        int answer = 0;
        answer = nthPiv(n)% 1234567;
        return answer;
    }
    static int nthPiv(int n){
        int hanKan = 0;
        int dooKan = 0;
        int output = 0;
        for(int i = 0 ; i < n + 1 ; i++){
            if(i == 0){
                output = 0;

            }else if(i == 1){
                hanKan = output;
                output = 1;
            }else{
                dooKan = hanKan;
                hanKan = output;
                output = hanKan% 1234567 + dooKan% 1234567;
            }
        }
        return output;
    }
}