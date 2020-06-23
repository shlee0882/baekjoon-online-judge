import java.util.*;

class Solution {
    public static int solution(int n) {
		// 시간초과
        int count = 0;
        int answer = 0;
        List<Integer> list1 = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 1) {
                list1.add(i);
            }
            count = 0;
        }
        answer = list1.size();

        return answer;
    }
}