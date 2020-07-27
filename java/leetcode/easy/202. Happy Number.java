import java.util.*;

public class Main {
    public static void main(String[] args) {
//        int n = 19;
//        int n = 20;
        int n = 1111111;

        isHappy(n);
    }

    public static boolean isHappy(int n) {
        boolean answer = true;
        String stData = String.valueOf(n);
        String[] stArr = stData.split("");

        int mulVal = 0;
        while(true){
            for(int i=0; i<stArr.length; i++){
                mulVal += Integer.parseInt(stArr[i]) * Integer.parseInt(stArr[i]);
            }

            if(stArr.length == mulVal && stArr.length == 7){
                answer = true;
                break;
            }
            if(String.valueOf(mulVal).length() > 1){
                stArr = String.valueOf(mulVal).split("");
                mulVal = 0;
            }else if(String.valueOf(mulVal).length() == 1 && mulVal == 1){
                answer = true;
                break;
            }else if(String.valueOf(mulVal).length() == 1){
                answer = false;
                break;
            }
        }
        System.out.println(answer);
        return  answer;
    }
}
