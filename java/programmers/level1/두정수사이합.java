class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a > b){
            while(true){
                if(a < b){
                    break;
                }else{
                    answer += b;
                    b += 1;
                }
            }
        }else if(a < b){
            while(true){
                if(a > b){
                    break;
                }else{
                    answer += a;
                    a += 1;
                }
            }
        }else{
            answer = a;
        }
        return answer;
    }
}