import java.util.*;

public class Main {

	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};
		//String[] phone_book = {"123","456","789"};
		//String[] phone_book = {"12","456","1235","567","88"};
		System.out.println(solution(phone_book));
	}
	
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        List<String> list1 = new ArrayList<>(Arrays.asList(phone_book));
        Collections.sort(list1);

    	int num=0;
    	
        while(true) {
        	for(int i=0; i<list1.size(); i++) {
        		String firstValue = list1.get(num);	
        		if(num != i) {
        			String secondValue = list1.get(i);
        			if(secondValue.length() <= firstValue.length()) {
        				if(secondValue.equals(firstValue.substring(0, secondValue.length()))) {
        					answer = false;
        					break;
        				}
        			}
        			
        		}
        	}
        	num++;
        	if(answer == false) {
        		break;
        	}
        	if(num == list1.size()) {
        		break;
        	}
        }
        return answer;
    }

}