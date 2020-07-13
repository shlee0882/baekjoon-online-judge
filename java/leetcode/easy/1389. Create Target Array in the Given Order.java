import java.util.*;

public class Main {
    public static void main(String args[]){
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        createTargetArray(nums, index);
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list1 = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            int val = nums[i];
            int idx = index[i];
            list1.add(idx, val);
        }

        int[] answer = list1.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
