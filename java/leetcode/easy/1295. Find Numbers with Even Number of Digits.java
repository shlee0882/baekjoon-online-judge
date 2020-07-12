import java.util.*;

public class Main {
    public static void main(String args[]){
        int[] nums = {12,345,2,6,7896};
        findNumbers(nums);
    }

    public static int findNumbers(int[] nums) {
        int answer = 0;
        List<Integer> list1 = new ArrayList<>();

        for (int tmp:nums){
            String str = String.valueOf(tmp);
            if(str.length() % 2 == 0){
                answer++;
            }

        }

        return answer;
    }
}
