package shortCode;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		//		Input: nums = [1,2,3,4]
		//		Output: [1,3,6,10]
		//		Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
		int[] nums = {1,1,1,1,1};
		runningSum(nums);
	}
	
    public static int[] runningSum(int[] nums) {
    	
        List<Integer> list1 = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
            list1.add(nums[i]);
        }
        
        List<Integer> list2 = new ArrayList<>();
        
        for(Integer it:list1){
            if(list2.size() == 0){
                list2.add(it);
            }else{
                int lastIdx = list2.get(list2.size()-1);
                int putIdx = lastIdx+it;
                list2.add(putIdx);
            }
        }
        int[] answer = list2.stream().mapToInt(i -> i).toArray();
        return answer;
    }

}
