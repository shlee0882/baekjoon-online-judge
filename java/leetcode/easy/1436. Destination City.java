import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		// ¿€º∫¡ﬂ....
		
//		String[][] tmp = {{"London","New York"},{"New York","Lima"},{"Lima","Sao Paulo"}};
//		String[][] tmp = {{"B","C"},{"D","B"},{"C","A"}};
//		String[][] tmp = {{"A","Z"}};
//		String[][] tmp = {{"pYyNGfBYbm","wxAscRuzOl"},{"kzwEQHfwce","pYyNGfBYbm"}};
//		String[][] tmp = {{"qMTSlfgZlC","ePvzZaqLXj"},{"xKhZXfuBeC","TtnllZpKKg"},{"ePvzZaqLXj","sxrvXFcqgG"},{"sxrvXFcqgG","xKhZXfuBeC"},{"TtnllZpKKg","OAxMijOZgW"}};
		
		String[][] tmp = {{"jMgaf WaWA","iinynVdmBz"},{" QCrEFBcAw","wRPRHznLWS"},{"iinynVdmBz","OoLjlLFzjz"},{"OoLjlLFzjz"," QCrEFBcAw"},{"IhxjNbDeXk","jMgaf WaWA"},{"jmuAYy vgz","IhxjNbDeXk"}};
		List paths = new ArrayList<>();	
		
		int index = 0;
		for (String[] str: tmp) {
			paths.add(Arrays.asList(str));
			index++;
		}
		destCity(paths);
		
	}

    public static String destCity(List<List<String>> paths) {
//    	System.out.println(paths);
    	List<String> tmpList = new ArrayList<>();	
    	String first= "";
    	String second= "";
    	int idx = 0;
    	for (List<String> list : paths) {
    		System.out.println("second: "+second);
    		System.out.println("list.get(0): "+list.get(0));
    		
    		if(!"".equals(first) && second.equals(list.get(0))) {
    			tmpList.add(list.get(0));
    			second= list.get(1);
    		}
			first = list.get(0);
			if(idx == 0 ) {
				second= list.get(1);
			}
    		idx++;
		}
    	
    	System.out.println(tmpList);
    	String answer = "";
    	return answer;
    }
    
}
