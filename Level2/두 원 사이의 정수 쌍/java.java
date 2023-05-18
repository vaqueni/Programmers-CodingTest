class Solution {

    public long solution(int r1, int r2) {
        long count = 0;
        long large = 0 ;
        long small = 0;
        for(int i = -r2 ; i < r2 + 1 ; i ++){
            large += countPoint_surface(r2, i);
        }
        System.out.println("inside :" + count);
        for(int i = -r1 ; i < r1 + 1 ; i ++){
            small += countPoint_inside(r1, i);
        }
    System.out.println("large: "+ large);
    System.out.println("small: "+ small);

    return count = large - small;



    }
    // 반지름이 r인 내부의 정수 좌표 중 x좌표가 x인 좌표의 개수를 알려주는 함수
    // 원의 경계도 포함한다.
    long countPoint_surface(int r, int x){
        long count;
        // ***중요*** sqrt() 함수 입력 type은 double
        int len = (int) Math.sqrt(1.0*r*r-1.0*x*x);
        count = 2*len+1;
        return count;
    }
    // 원의 경계는 포함하지 않음
    long countPoint_inside(int r, int x){
        long count = countPoint_surface(r, x);
        if(Math.sqrt(1.0*r*r-1.0*x*x)%1 == 0 ){
            if(1.0*r*r != 1.0*x*x)count = count - 2;
            else count--;
        }
        return count;
    }
}