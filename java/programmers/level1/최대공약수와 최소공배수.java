import java.util.*;

public class Main {
    public static void main(String args[]) {
        int n = 256;
        int m = 128;
        // 2 12 2 6 2 3
        System.out.println(solution(n,m));
    }
    public static int[] solution(int n, int m) {
        int chedae = 1;
        int cheso = 1;

        if(n<=m){
            for(int i=2; i<=m; i++){
                // 최대공약수
                if(n%i==0 && m%i==0){
                    chedae *= i;
                    n = n/i;
                    m = m/i;
                    // 5 * 1 * 5
                    cheso = n*m*chedae;
                    i--;
                }
            }
        }else if(n>=m){
            for(int i=2; i<=n; i++){
                // 최대공약수
                if(n%i==0 && m%i==0){
                    chedae *= i;
                    n = n/i;
                    m = m/i;
                    // 5 * 1 * 5
                    cheso = n*m*chedae;
                    i--;
                }
            }
        }

        if(cheso == 1){
            cheso = n*m;
        }
        int[] answer = new int[2];
        System.out.println(chedae);
        System.out.println(cheso);

        answer[0] = chedae;
        answer[1] = cheso;

        return answer;
    }
}