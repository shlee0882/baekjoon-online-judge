import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String args[]) {
//        System.out.println(fibo(5));
        fibo2(5);
    }

    // 누승수열
    // input = 4 output = 4! + 3! + 2! + 1!
    // (4*3*2*1) + (3*2*1) + (2*1) + (1*1)
    private static void nusung(int n) {
        int sum = 1;
        int val = n;
        List<Integer> list1 = new ArrayList<>();
        for(int i=1; i<=val; i++){
            while(true){
                if(n>1){
                    sum *= n;
                    n -= 1;
                }else{
                    list1.add(sum);
                    sum = 1;
                    n = val-i;
                    break;
                }
            }
        }
        System.out.println(list1);
        int ab = list1.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(ab);
    }

    // 1,1,2,3,5,8
    private static int fibonachi(int num) {
        int answer = 0;
        if(num <= 1) {
            return 1;
        }else {
            return fibonachi(num-1)+fibonachi(num-2);
        }
    }

    // 1,1,2,3,5,8
    private static void fibonachi2(int num) {
        List<Integer> list1 = new ArrayList<>();
        int n1 = 0;
        int n2 = 1;
        int result = 0;
        for(int i=0; i<num; i++){
            result = n1+n2;
            n1 = n2;
            n2 = result;
            list1.add(result);
        }
        System.out.println(result);
        System.out.println(list1);
        System.out.println(list1.get(list1.size()-1));

    }

    private static int recursive(int num) {
        if(num == 1){
            return num;
        }else{
            return num+recursive(num-1);
        }
    }

    public static List bubbleSort(int[] arr) {
        List<Integer> list1 = new ArrayList<>(arr.length);
        for(int i=0; i<arr.length; i++){
            list1.add(arr[i]);
        }

        for(int i=0; i<list1.size(); i++){
            for(int j=0; j<list1.size()-i-1; j++){
                if(list1.get(j) > list1.get(j+1)){
                    int currentVal = list1.get(j);
                    int nextVal = list1.get(j+1);
                    int currentIdx = list1.indexOf(list1.get(j));
                    int nextIdx = list1.indexOf(list1.get(j+1));
                    list1.set(currentIdx, nextVal);
                    list1.set(nextIdx, currentVal);
                }
            }
        }
        return list1;
    }

    public static List selectionSort(int[] arr) {
        List<Integer> list1 = new ArrayList<>(arr.length);
        for(int i=0; i<arr.length; i++){
            list1.add(arr[i]);
        }

        int lowest = 0;
        for(int i=0; i<list1.size(); i++){
            lowest = list1.get(i);
            for(int j=i; j<list1.size(); j++){
                if(lowest > list1.get(j)){
                    lowest = list1.get(j);
                }
            }
            int lowestIdx = list1.indexOf(lowest);
            int currentVal = list1.get(i);
            list1.set(i, lowest);
            list1.set(lowestIdx, currentVal);
            System.out.println(list1);
        }

        return list1;
    }

    public static int fibo(int num){
        if(num <=1){
            return 1;
        }else{
            return fibo(num-1)+fibo(num-2);
        }
    }

    public static void fibo2(int num){
        int n1 = 0;
        int n2 = 1;
        int result = 0;
        for(int i=0; i<num; i++){
            result = n1+n2;
            n1 = n2;
            n2 = result;
        }
        System.out.println(result);
    }

}