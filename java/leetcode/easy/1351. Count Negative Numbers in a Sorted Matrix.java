import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        countNegatives(grid);
    }

    public static int countNegatives(int[][] grid) {
        List<Integer> list1 = new ArrayList<>();
        int answer = 0;
        for (int[] tmp:grid) {
            int cnt = (int) Arrays.stream(tmp).filter(i->i < 0).count();
            answer += cnt;
        }
        System.out.println(answer);
        return answer;
    }
}
