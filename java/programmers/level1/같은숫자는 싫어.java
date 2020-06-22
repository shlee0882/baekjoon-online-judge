import java.util.*;

public class Main {
    public static void main(String args[]) {
       int[] arr = {55,55,46,3,0,1,1};
        System.out.println(solution(arr));
    }

    public static int[] solution(int[] arr) {
        int current, next =0;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            list1.add(arr[i]);
        }

        int i = 0;
        while(true) {
            current = list1.get(i);
            if (i + 1 < list1.size()) {
                next = list1.get(i + 1);
                if(i == 0){
                    list2.add(current);
                }
                if (current != next) {
                    list2.add(next);
                    i++;
                }else{
                    i++;
                }
            }else{
                break;
            }
        }

        int[] answer = new int[list2.size()];
        for(int k=0; k<list2.size();k++){
            System.out.println(list2.get(k));
            answer[k] = list2.get(k);
        }

        return answer;
    }
}
