import java.util.*;

public class Main {
    public static void main(String args[]){
        String s = "RLLLLRRRLR";
        balancedStringSplit(s);
    }

    public static int balancedStringSplit(String s) {

        String[] strArr = s.split("");
        List<String> list1 = new ArrayList<>(Arrays.asList(strArr));
        List<String> list2 = new ArrayList<>();

        int rInt = 0;
        int lInt = 0;
        String tmpStr = "";

        int answer = 0;
        for (int i=0; i<list1.size(); i++) {

            if("R".equals(list1.get(i))){
                tmpStr += list1.get(i);
                rInt++;
            }else if("L".equals(list1.get(i))){
                tmpStr += list1.get(i);
                lInt++;
            }

            if(rInt != 0 && lInt !=0 && rInt == lInt){
                list2.add(tmpStr);
                tmpStr = "";
                answer++;
            }

        }

        return answer;
    }
}
