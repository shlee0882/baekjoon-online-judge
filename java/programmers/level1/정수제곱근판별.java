import java.util.*;

public class Main {
    public static void main(String args[]) {
        long n = 121;
        System.out.println(solution(n));
    }
    public static long solution(long n) {
        long answer = 0;
        long tmp = 0;
        for(long i=1; i<=n; i++){
            if(i*i == n){
                tmp = (i+1)*(i+1);
                break;
            }else{
                tmp = -1;
            }
        }
        answer = tmp;
        return answer;
    }
}