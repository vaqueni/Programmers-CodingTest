class Solution {
    public String solution(String s) {
        String answer = "";
        String[] splited = s.split(" ");
        for(String str: splited){
            // 앞글자를 잘라서 대문자로 바꿈
            String head = str.toUpperCase().substring(0,1);
            // 뒤에 글자를 잘라서 소문자로 일단 바꿈
            str = str.toLowerCase().substring(1,str.length());

            answer = answer + head + str + " ";
            }

        return answer.substring(0, answer.length());
    }

    public static void main(String[] args){
        System.out.println(((int)('a')-(int)('A')));
        // System.out.println(());
        
        String str ="hello world";
        String str2= "3people unFollowed me";
        
        Solution sol = new Solution();
        System.out.println(sol.solution(str));
        System.out.println(sol.solution(str2));
    }
}

