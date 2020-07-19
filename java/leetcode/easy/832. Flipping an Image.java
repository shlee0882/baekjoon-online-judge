import java.util.*;

public class Main {
    public static void main(String args[]) {
//        int[][] A = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] A = {{1,1,0,0}, {1,0,0,1}, {0,1,1,1}, {1,0,1,0}};
        flipAndInvertImage(A);
    }

    public static int[][] flipAndInvertImage(int[][] A) {
//        [1,1,0],[1,0,1],[0,0,0]
//        [0,1,1],[1,0,1],[0,0,0]
        List<List<Integer>> list2 = new ArrayList<>();

        for (int[] intArr: A) {
            int len = intArr.length-1;
            List<Integer> list1 = new ArrayList<>();
            while(len >= 0){
                int ele = intArr[len];
                if(ele == 0){
                    ele = 1;
                }else{
                    ele = 0;
                }
                list1.add(ele);

                if(len == 0){
                    list2.add(list1);
                    break;
                }
                len--;
            }
        }
        System.out.println(list2);

        // List<List<Integer>> to int[][] transfer
        int[][] answer = list2.stream()
                .map(u->u.stream().mapToInt(k-> (int) k).toArray())
                .toArray(int[][]::new);
        return answer;
    }
}