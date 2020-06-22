import java.util.*;

public class Main {
    public static void main(String args[]) {
        // String s = "pPoooyY";
        // String s = "Pyy";
        String s = "abc";
        System.out.println(solution(s));
    }

    static boolean solution(String s) {
        boolean answer = true;

        int pCnt = 0, yCnt = 0;
        List<String> list1 = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            String value = String.valueOf(s.charAt(i));
            if("p".equals(value) || "P".equals(value)) {
                pCnt++;
            }else if("y".equals(value) || "Y".equals(value)){
                yCnt++;
            }
        }

        if(pCnt == yCnt || pCnt ==0 && yCnt == 0){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}