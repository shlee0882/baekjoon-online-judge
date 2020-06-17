import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String s) {

        int len = s.length();
        List<String> list1 = new ArrayList<>();

        for(int i=0; i<len; i++){
            list1.add(String.valueOf(s.charAt(i)));
        }

        System.out.println(list1);
        int listSize = list1.size();

        String answer = "";
        while(true){
            if(listSize % 2 == 0){
                if(list1.size() == 2){
                    answer += list1.get(0)+list1.get(1);
                    break;
                }else{
                    list1.remove(0);
                    list1.remove(list1.size()-1);
                }
            }else{
                if(list1.size() == 1){
                    answer += list1.get(0);
                    break;
                }else{
                    list1.remove(0);
                    list1.remove(list1.size()-1);
                }
            }
        }

        return answer;
    }
}
