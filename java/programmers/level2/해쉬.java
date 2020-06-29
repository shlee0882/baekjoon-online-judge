import java.util.*;

public class Main {
    public static void main(String args[]) {
        String[][] clothes = {{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};
        solution(clothes);
    }

    // [[yellow_hat, headgear], [blue_sunglasses, eyewear], [green_turban, headgear]]

    //  얼굴	동그란 안경, 검정 선글라스
    //  상의	파란색 티셔츠
    //  하의	청바지
    //  겉옷	긴 코트

    // 1. yellow_hat
    // 2. blue_sunglasses
    // 3. green_turban
    // 4. yellow_hat + blue_sunglasses
    // 5. green_turban + blue_sunglasses
    // output : 5
    // 해시 위장 다시풀어볼 것...
    public static int solution(String[][] clothes) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        for (int i = 0; i < clothes.length; i++) {
            if (hm.containsKey(clothes[i][1]))
                hm.replace(clothes[i][1], hm.get(clothes[i][1])+1);
            else
                hm.put(clothes[i][1], 1);
        }

        int answer = 1;
        for (int value : hm.values()) {
            answer*=(value+1);
        }
        answer-=1;

        return answer;
    }
}