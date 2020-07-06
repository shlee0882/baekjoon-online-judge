import java.util.*;

public class Main {
    public static void main(String args[]){
        String address = "1.1.1.1";
        defangIPaddr(address);
    }
    public static String defangIPaddr(String address) {
        String[] strArr = address.split("");
        List<String> list1 = new ArrayList<>(Arrays.asList(strArr));
        List<String> list2 = new ArrayList<>();

        for (String str:list1) {
            if(".".equals(str)){
                list2.add("[.]");
            }else{
                list2.add(str);
            }
        }
        String answer = "";

        for(String str:list2){
            answer += str;
        }
        return answer;
    }
}
