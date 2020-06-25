import java.util.*;

public class Main {
    public static void main(String args[]) {
        String s = "a B z";
        int n = 4;
        System.out.println(solution(s, n));
    }
    public static String solution(String s, int n) {
        // 9~13 테스트케이스 실패
        String answer = "";
        String[] arr1;
        if(s.contains(" ")){
            arr1 = s.split(" ");
        }else{
            arr1 = s.split("");
        }
        String[] low = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] up = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

        List<String> list1 = new ArrayList<>(Arrays.asList(arr1));
        List<String> lower = new ArrayList<>(Arrays.asList(low));
        List<String> upper = new ArrayList<>(Arrays.asList(up));
        List<String> tmp = new ArrayList<>();

        StringBuilder getSt = new StringBuilder(s);

        for(String st:list1){
            // 대문자
            if(st.equals(st.toUpperCase())){
                int upIdx = upper.indexOf(st);
                if(upIdx+n <= up.length-1){
                    tmp.add(upper.get(upIdx+n));
                }else{
                    tmp.add(upper.get(upIdx+n-up.length));
                }
            }else if(st.equals(st.toLowerCase())){
                int lowIdx = lower.indexOf(st);
                if(lowIdx+n <= low.length-1){
                    tmp.add(lower.get(lowIdx+n));
                }else{
                    tmp.add(lower.get(lowIdx+n-low.length));
                }
            }
        }

        int k=0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c != ' '){
                char[] charTmp = tmp.get(k).toCharArray();
                getSt.setCharAt(i,charTmp[0]);
                k++;
            }
        }
        answer = String.valueOf(getSt);
        return answer;
    }
}