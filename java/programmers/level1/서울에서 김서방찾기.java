import java.util.*;

public class Main {
    public static void main(String args[]) {
        String[] seoul = {"Jane", "Kim"};
        System.out.println(solution(seoul));
    }

    public static String solution(String[] seoul) {
        String answer = "";

        List<String> list1 = new ArrayList<>(Arrays.asList(seoul));

        for(int i=0; i<list1.size(); i++){
            if("Kim".equals(list1.get(i))){
                answer = "김서방은 "+String.valueOf(i)+"에 있다";
            }
        }

        return answer;
    }
}
