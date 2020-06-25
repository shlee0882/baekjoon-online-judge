import java.util.*;

public class Main {
    public static void main(String args[]) {
        long n = 118372;
        System.out.println(solution(n));
    }
    public static long solution(long n) {
        long answer = 0;
        List<Integer> list1 = new ArrayList<>();

        String st1 = String.valueOf(n);
        String tmp1 = "";
        for(int i=0; i<st1.length(); i++){
            String tmpSt = String.valueOf(st1.charAt(i));
            int tmpInt = Integer.valueOf(tmpSt);
            list1.add(tmpInt);
        }
        Collections.sort(list1, Collections.reverseOrder());

        for(int i=0; i<list1.size(); i++){
            tmp1 += list1.get(i);
        }

        answer = Long.parseLong(tmp1);
        return answer;
    }
}