import java.util.*;

public class Main {
    public static void main(String args[]) {
        int n = 123;
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        int answer = 0;
        String s = String.valueOf(n);

        int tmp = 0;
        for(int i=0; i<s.length(); i++){
            String a = String.valueOf(s.charAt(i));
            int b = Integer.valueOf(a);
            tmp += b;
        }
        answer = tmp;
        return answer;
    }
}