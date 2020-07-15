import java.util.*;

public class Main {
    public static void main(String args[]){
        int num = 9999;
        maximum69Number(num);
    }

    public static int maximum69Number (int num) {
        String tmp = String.valueOf(num);
        String[] tmpArr = tmp.split("");
        int[] tmpIntArr = new int[tmpArr.length];
        List<Integer> list1 = new ArrayList<>();
        for(int i=0; i<tmpArr.length; i++){
            tmpIntArr[i] = Integer.parseInt(tmpArr[i]);
        }

        int i=0;
        int len = tmpIntArr.length;
        int answer = 0;
        if(num != 9 && num != 99 && num != 999 && num != 9999 && num != 99999 ) {
            while (i < len) {
                int tmpInt = tmpIntArr[i];
                if (tmpInt == 9) {
                    tmpIntArr[i] = 6;
                } else if (tmpInt == 6) {
                    tmpIntArr[i] = 9;
                }
                String tmpStr = "";
                for (int j = 0; j < tmpIntArr.length; j++) {
                    tmpStr += String.valueOf(tmpIntArr[j]);
                }
                list1.add(Integer.valueOf(tmpStr));

                if (tmpInt == 9) {
                    tmpIntArr[i] = 9;
                } else if (tmpInt == 6) {
                    tmpIntArr[i] = 6;
                }
                i++;
            }
            answer = Collections.max(list1);
        }else{
            answer = num;
        }
        System.out.println(answer);
        return answer;
    }
}
