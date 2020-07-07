import java.util.*;

public class Main {
    public static void main(String args[]){
        int num = 123;
        numberOfSteps(num);
    }

    public static int numberOfSteps (int num) {
        int step = 0;
        while(num > 0){
            if(num % 2 == 0){
                num = num / 2;
                step++;
            }else{
                num = num - 1;
                step++;
            }
        }
        int answer = step;
        return answer;
    }
}
