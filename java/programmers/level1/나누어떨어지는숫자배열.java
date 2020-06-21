import java.util.*;

public class Main {
    public static void main(String args[]) {
        int[] arr = {3, 2, 6};
        System.out.println(solution(arr,10));
    }

    public static int[] solution(int[] arr, int divisor) {

        List<Integer> result = new ArrayList<>();

        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            int val = arr[i];
            boolean sw = false;
            if(divisor > val){
                cnt++;
                if(arr.length == cnt){
                    result.add(-1);
                }
            }else{
                if(val % divisor == 0){
                    result.add(val);
                }else{
                    cnt++;
                    if(arr.length == cnt){
                        result.add(-1);
                    }
                }
            }
        }
        Collections.sort(result);
        int[] answer = result.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}