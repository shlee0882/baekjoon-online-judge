import java.util.*;

public class Main {
    public static void main(String args[]) {
        int x = 2;
        int n = 5;
        System.out.println(solution(x, n));
    }

    public static long[] solution(int x, int n) {
        List<Long> list1 = new ArrayList<>();
        long tmp = 0;
        for(long i=0; i<n; i++){
            tmp = tmp+x;
            list1.add(tmp);
        }
        long[] answer = new long[list1.size()];

        for(int i=0; i<list1.size(); i++){
            answer[i] = list1.get(i);
        }

        return answer;
    }
}