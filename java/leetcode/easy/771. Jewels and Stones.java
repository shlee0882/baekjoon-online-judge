import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String args[]) {
        String J = "aA";
        String S = "aAAbbbb";
        numJewelsInStones(J,S);
    }

    public static int numJewelsInStones(String J, String S) {
        String[] jStr = J.split("");
        String[] sStr = S.split("");

        List<String> jList = new ArrayList<>(Arrays.asList(jStr));
        List<String> sList = new ArrayList<>(Arrays.asList(sStr));

        int answer = 0;

        for (String str: sList) {
            if(jList.contains(str)) {
                answer++;
            }
        }

        return answer;
    }
}