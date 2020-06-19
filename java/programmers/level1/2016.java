import java.util.*;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int totalDay = 0;

        List<Integer> allDays = new ArrayList<>(Arrays.asList(31,29,31,30,31,30,31,31,30,31,30,31));
        List<String> todayList = new ArrayList<>(Arrays.asList("FRI","SAT","SUN","MON","TUE","WED","THU"));

        totalDay += b;
        for (int i=0; i<a-1; i++){
            totalDay += allDays.get(i);
        }

        int k=0;
        for (int i=1; i<=totalDay; i++){
            if(k <= todayList.size()-1){
                answer = todayList.get(k);
                if(k==6){
                    k=0;
                }else{
                    k++;
                }
            }
        }
        return answer;
    }
}