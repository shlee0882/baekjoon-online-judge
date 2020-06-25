import java.util.*;

public class Main {
    public static void main(String args[]) {
        int n = 12345;
        System.out.println(solution(n));
    }
    public static int[] solution(long n) {
        String st1 = String.valueOf(n);
        List<Integer> list1 = new ArrayList<>();
        for(int i=st1.length()-1; i >= 0; i--){
            String tmpSt = String.valueOf(st1.charAt(i));
            int tmpInt = Integer.valueOf(tmpSt);
            list1.add(tmpInt);
        }
        int[] answer = new int[list1.size()];
        for(int i=0; i<list1.size(); i++){
            answer[i] = list1.get(i);
        }

        return answer;
    }
}