class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int n, m;

        for(int i = 1 ; i <= Math.sqrt(yellow) ; i++){
            if(yellow % i == 0){
                m = i; 
                n = yellow/i;
                if(brown == 2*n + 2*m + 4){
                    answer[0] = n + 2; answer[1] = m + 2;
                    return answer;
                }
            }
        }
        System.out.println("wrong enter");
        return answer;
    }
}