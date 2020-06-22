import java.util.*;

public class Main {
    public static void main(String args[]) {
		// test case 5번 실패
        int n = 5;
        int[] lost = {2,3};
        int[] reverse = {4};
        System.out.println("기대값: 4 출력값: "+solution(n, lost, reverse));

        n = 5;
        int[] lost2 = {2,4};
        int[] reverse2 = {1,3,5};
        System.out.println("기대값: 5 출력값: "+solution(n, lost2, reverse2));

        n = 5;
        int[] lost3 = {2,4};
        int[] reverse3 = {3};
        System.out.println("기대값: 4 출력값: "+solution(n, lost3, reverse3));

        n = 5;
        int[] lost4 = {1,2,3};
        int[] reverse4 = {1,2,3};
        System.out.println("기대값: 5 출력값: "+solution(n, lost4, reverse4));


        n = 8;
        int[] lost5 = {3,7};
        int[] reverse5 = {2,4};
        System.out.println("기대값: 7 출력값: "+solution(n, lost5, reverse5));

        n = 5;
        int[] lost6 = {2,3,5};
        int[] reverse6 = {2,4};
        System.out.println("기대값: 4 출력값: "+solution(n, lost6, reverse6));

        n = 5;
        int[] lost7 = {1,2};
        int[] reverse7 = {2,3};
        System.out.println("기대값: 4 출력값: "+solution(n, lost7, reverse7));

        n = 5;
        int[] lost8 = {3,5};
        int[] reverse8 = {2,4};
        System.out.println("기대값: 4 출력값: "+solution(n, lost8, reverse8));

        n = 8;
        int[] lost9 = {3,5};
        int[] reverse9 = {2,4};
        System.out.println("기대값: 8 출력값: "+solution(n, lost9, reverse9));

        n = 5;
        int[] lost10 = {2,3,4};
        int[] reverse10 = {3,4,5};
        System.out.println("기대값: 4 출력값: "+solution(n, lost10, reverse10));

    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        List<Integer> student = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            student.add(i);
        }

        for (int i = 0; i < lost.length; i++) {
            student.remove(new Integer(lost[i]));
        }

        int cnt = 0;
        int val = 0;

        for(int i=0; i<reserve.length; i++){

            val = reserve[i];

            if(student.contains(val)){
                // 첫번째가 1인경우
                if(val == 1){
                    if(!student.contains(val+1) && !tmp.contains(val+1)){
                        tmp.add(val+1);
                        cnt++;
                    }
                } // 마지막인 경우
                else if(i==reserve.length-1){
                    // 마지막값이 같을경우
                    if(student.get(student.size()-1) == reserve[reserve.length-1]){
                        if(!student.contains(val-1) && !tmp.contains(val-1)){
                            tmp.add(val-1);
                            cnt++;
                        }
                    }else{
                        if(!student.contains(val-1) && !tmp.contains(val-1)){
                            tmp.add(val-1);
                            cnt++;
                        }else if(!student.contains(val+1) && !tmp.contains(val+1)){
                            tmp.add(val+1);
                            cnt++;
                        }
                    }

                }else{
                    if(!student.contains(val-1) && !tmp.contains(val-1) ){
                        tmp.add(val-1);
                        cnt++;
                    }else if(!student.contains(val+1) && !tmp.contains(val+1)){
                        tmp.add(val+1);
                        cnt++;
                    }
                }
            }else{
                tmp.add(val);
                cnt++;
            }

        }
        cnt = student.size()+cnt;

        return cnt;
    }
}