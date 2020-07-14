import java.util.*;

public class Main {
    public static void main(String args[]){
        int[] startTime = {9,8,7,6,5,4,3,2,1};
        int[] endTime = {10,10,10,10,10,10,10,10,10};
        int queryTime = 5;

        busyStudent(startTime, endTime, queryTime);
    }

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int answer = 0;

        for(int i=0; i<startTime.length; i++){
            if(startTime[i] <= queryTime && endTime[i] >= queryTime){
                answer++;
            }
        }
        return answer;
    }
}
