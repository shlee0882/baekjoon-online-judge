import java.util.*;

public class Main {
    public static void main(String args[]) {
        // int[] arr = {4,3,1,2};
        int[] arr = {10};

        System.out.println(solution(arr));
    }
    public static int[] solution(int[] arr) {

        List<Integer> list1 = new ArrayList<Integer>(arr.length);
        for (int i : arr){
            list1.add(i);
        }
        Collections.sort(list1, Collections.reverseOrder());
        list1.remove(list1.size()-1);
        if(list1.size() == 0){
            list1.add(-1);
        }

        int[] answer = new int[list1.size()];
        for(int i=0; i<list1.size(); i++){
            answer[i] = list1.get(i);
        }
        return answer;
    }
}