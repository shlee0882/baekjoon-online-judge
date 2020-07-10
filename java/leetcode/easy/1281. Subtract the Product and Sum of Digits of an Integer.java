import java.util.*;

public class Main {
    public static void main(String args[]){
        int n = 4421;
        subtractProductAndSum(n);
    }

    public static int subtractProductAndSum(int n) {
        String str = String.valueOf(n);
        String[] strArr = str.split("");
        List<Integer> list1 = new ArrayList<>();

        for (String tmp:strArr) {
            int val = Integer.parseInt(tmp);
            list1.add(val);
        }

        int mul = 1;
        int sum = 0;
        for(int tmp:list1){
            mul *= tmp;
            sum += tmp;
        }

        int answer = mul-sum;
        return answer;
    }
}
