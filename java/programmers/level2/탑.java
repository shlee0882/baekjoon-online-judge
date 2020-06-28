import java.util.*;

public class Main {
    public static void main(String args[]) {
        int[] arr = {5, 3, 1, 2, 3};
        solution(arr);
    }

    public static int[] solution(int[] arr) {
        List<Integer> list1 = new ArrayList<>(arr.length);
        for(int i=0; i<arr.length; i++){
            list1.add(arr[i]);
        }

        List<Integer> list2 = new ArrayList<>();
        int lastVal = arr.length-1;

        while(true){
            for(int i=lastVal; i>=0; i--){
                if(i<lastVal){
                    if(list1.get(i) > list1.get(lastVal)){
                        list2.add(0, i+1);
                        break;
                    }else if(i == 0 && list1.get(i) < list1.get(lastVal)){
                        list2.add(0, 0);
                        break;
                    }
                }
            }
            lastVal--;
            if(lastVal == 0){
                break;
            }
        }

        while(true){
            if(list2.size() < list1.size()){
                list2.add(0, 0);
            }
            if(list2.size() == list1.size()){
                break;
            }
        }
        int[] answer = list2.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}