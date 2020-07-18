import java.util.*;

public class Main {
    public static void main(String[] args) {
//        String s = "10#11#12";
//        String s = "1326#";
//        String s = "25#";
        String s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
        freqAlphabets(s);
    }

    public static String freqAlphabets(String s) {
        Map<String, String> tmpMap = new HashMap<>();
        int i=1;
        for(char alphabet = 'a'; alphabet <='z'; alphabet++ ){
            if(alphabet <= 'i'){
                tmpMap.put(String.valueOf(i),String.valueOf(alphabet));
                i++;
            }else if(alphabet > 'i'){
                String hashTagStr = String.valueOf(i)+"#";
                tmpMap.put(hashTagStr,String.valueOf(alphabet));
                i++;
            }
        }
        System.out.println(tmpMap);
        String answer = "";
        // 1326#
        for(int k=0; k<s.length(); k++){
            if(k+3 <= s.length() && s.substring(k,k+3).contains("#")){
                String str1 = s.substring(k,k+3);
                if(tmpMap.containsKey(str1)){
                    answer += tmpMap.get(str1);
                    k += 2;
                }
            }else{
                String str2 = s.substring(k,k+1);
                if(tmpMap.containsKey(str2)){
                    answer += tmpMap.get(str2);
                }
            }

        }
        System.out.println("최종값: "+answer);
        return answer;
    }
}
