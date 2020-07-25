import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        majorityElement(nums);
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int answer = nums[nums.length/2];
        System.out.println(answer);
        return nums[nums.length/2];
    }
}
