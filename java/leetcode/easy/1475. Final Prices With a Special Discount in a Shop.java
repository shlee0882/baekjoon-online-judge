import java.util.*;

public class Main {
    public static void main(String args[]) {
//        int[] prices = {8,4,6,2,3};
//        int[] prices = {1,2,3,4,5};
        int[] prices = {10,1,1,6};

        finalPrices(prices);
    }

    public static int[] finalPrices(int[] prices) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int tmp:prices) {
            list1.add(tmp);
        }

        int idx = 1;
        for(int i=1; i<list1.size(); i++){
            int preVal = list1.get(i-1);
            int curVal = list1.get(i);
            if(preVal >= curVal){
                list2.add(preVal-curVal);
            }else{
                int tmpIdx = i;
                while(true){
                    if(tmpIdx < list1.size()-1){
                        tmpIdx++;
                    }

                    int val1 = list1.get(tmpIdx);
                    if(preVal >= val1){
                        list2.add(preVal-val1);
                        break;
                    }else if(tmpIdx == list1.size()-1){
                        list2.add(preVal);
                        break;
                    }
                }
            }
        }
        list2.add(list1.get(list1.size()-1));

        int[] answer = list2.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}