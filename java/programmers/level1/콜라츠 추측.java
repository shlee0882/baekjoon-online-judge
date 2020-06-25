import java.util.*;

public class Main {
    public static void main(String args[]) {
        int num = 626331;
        System.out.println(solution(num));
    }
    public static int solution(int num) {
        int answer = 0;
        int cnt = 0;

        while(true){
            if(num == 1){
                break;
            }
            // 짝수
            if(num % 2 == 0){
                num = num / 2;
            }else if(num % 2 == 1){
                num = (num * 3)+1;
            }

            if(cnt >= 500){
                cnt = -1;
                break;
            }
            cnt++;
        }
        answer = cnt;
        return answer;
    }
}