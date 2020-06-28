import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String args[]) {
        // 중복되는 값을 1개는 유지하고 지우기
        // abcdabcdef -> abcdef
        // abcbcef => abcef
        String str = "abcbcef";
        solution(str);
    }

    public static String[] solution(String str) {
        String[] stArr = str.split("");
        List<String> list1 = new ArrayList<>(Arrays.asList(stArr));
        Map<String, Integer> map1 = new HashMap<>();
        int strLen = str.length();

        for(int i=0; i<list1.size(); i++){
            if(map1.containsKey(list1.get(i))){
                int cntVal = map1.get(list1.get(i));
                cntVal++;
                map1.put(list1.get(i), cntVal);
            }else{
                map1.put(list1.get(i), 1);
            }
        }

        System.out.println(map1);
        String tmpSt = "";
        List<String> tmpList = new ArrayList<>();

        for(int i=0; i<map1.size(); i++){
            if(map1.get(stArr[i]) > 1){
                if(!tmpList.contains(stArr[i])){
                    tmpSt += stArr[i];
                    tmpList.add(stArr[i]);
                }
            }
        }

        String[] tmpArr = tmpSt.split("");
        System.out.println("2개 이상 갖고 있는 값: "+tmpSt);
        List<String> putList = new ArrayList<>();

        for(int i=0; i<strLen; i++){
            // 2이상인 애들 첫출현만 제거 하지말고 나머지 제거하기
            for(int j=0; j<tmpArr.length; j++){
                if(String.valueOf(str.charAt(i)).equals(tmpArr[j])){
                    if(putList.contains(tmpArr[j])){
                        list1.remove(i);
                        list1.add(i,"0");
                    }else{
                        putList.add(tmpArr[j]);
                    }
                }
            }
        }
        System.out.println(list1);
        list1 = list1.stream().filter(n->n != "0").collect(Collectors.toList());
        System.out.println(list1);
        String[] answer = list1.toArray(new String[list1.size()]);
        return answer;
    }
}