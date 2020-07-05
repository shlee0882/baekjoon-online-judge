import java.util.*;

public class Main {
    public static void main(String args[]){

//        Input: candies = [2,3,5,1,3], extraCandies = 3
//        Output: [true,true,true,false,true]

        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        kidsWithCandies(candies,extraCandies);
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answer = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        for (int tmp: candies) {
            list1.add(tmp);
        }

        int maxVal = Collections.max(list1);

        for (int tmp: list1) {
            if(tmp+extraCandies >= maxVal){
                answer.add(true);
            }else{
                answer.add(false);
            }
        }

        return answer;
    }
}
