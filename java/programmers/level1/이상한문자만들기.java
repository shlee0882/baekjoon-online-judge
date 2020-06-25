import java.util.*;

public class Main {
    public static void main(String args[]) {
        String s = "try hello world";
        System.out.println(solution(s));
    }
    public static String solution(String s) {
        String answer = "";
        String tmp = "";
        char[] char1 = s.toCharArray();

        int idx = 0;
        for(int i=0; i<s.length(); i++){
            if(char1[i] == ' '){
                idx = 0;
                tmp += ' ';
            }else{
                // 짝수
                if(idx%2 == 0){
                    tmp += String.valueOf(s.charAt(i)).toUpperCase();
                }else if(idx%2 == 1){
                    tmp += String.valueOf(s.charAt(i)).toLowerCase();
                }
                idx++;
            }

        }
        answer = tmp;
        return answer;
    }
}