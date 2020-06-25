import java.util.*;

public class Main {
    public static void main(String args[]) {
        String phone_number = "027778888";
        System.out.println(solution(phone_number));
    }
    public static String solution(String phone_number) {
        String answer = "";
        String tmp = "";
        for (int i=0; i<phone_number.length(); i++){
            if(i < phone_number.length()-4){
                tmp += "*";
            }else{
                tmp += String.valueOf(phone_number.charAt(i));
            }
        }
        answer = tmp;
        return answer;
    }
}