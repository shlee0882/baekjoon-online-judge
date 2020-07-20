import java.util.*;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {3,5,1};
//        int[] arr = {1,2,4};
        int[] arr = {18,8,0,15,4,-3,17,-18,-4,-7,-12,5,-16,20};
        canMakeArithmeticProgression(arr);
    }

    public static boolean canMakeArithmeticProgression(int[] arr) {
        boolean answer = true;

        List<Integer> list1 = new ArrayList<>();
        for (int tmp:arr) {
            list1.add(tmp);
        }

        Collections.sort(list1,Collections.reverseOrder());

        int val = 0;
        int interval = 0;
        for(int i=1; i<list1.size(); i++){
            int previous = list1.get(i-1);
            int current = list1.get(i);
            if(i > 1) {
                if(interval == previous - current){
                    answer = true;
                }else{
                    answer = false;
                    break;
                }
            }else{
                interval =  previous - current;
            }
        }
        System.out.println(answer);
        return answer;

    }
}
