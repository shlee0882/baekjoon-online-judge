import java.util.*;

public class Main {
    public static void main(String args[]) {
        int x = 13;
        System.out.println(solution(x));
    }
    public static boolean solution(int x) {
        boolean answer = true;
        String st1 = String.valueOf(x);

        int tmpInt = 0;
        for(int i=0; i<st1.length(); i++){
            String tmpSt = String.valueOf(st1.charAt(i));
            tmpInt += Integer.valueOf(tmpSt);
        }

        if(x % tmpInt == 0){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}