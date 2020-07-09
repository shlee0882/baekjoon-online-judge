import java.util.*;

public class Main {
    public static void main(String args[]){
        int[] nums = {8,1,2,2,3};
        smallerNumbersThanCurrent(nums);
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int old[]=Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums);
        int result[] = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i],i);
            }
        }
        for(int i=0;i<nums.length;i++) {
            result[i]=map.get(old[i]);
        }
        return result;
    }
}
