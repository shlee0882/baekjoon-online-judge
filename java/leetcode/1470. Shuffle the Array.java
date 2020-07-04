import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
//        Input: nums = [2,5,1,3,4,7], n = 3
//        Output: [2,3,5,4,1,7]
//        Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        shuffle(nums,n);
    }
    public static int[] shuffle(int[] nums, int n) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int tmp: nums) {
            list1.add(tmp);
        }

        for(int i=0; i<list1.size(); i++){
            if(i+n < list1.size()){
                list2.add(list1.get(i));
                list2.add(list1.get(i+n));
            }else{
                break;
            }
        }

        int[] answer = list2.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
