import java.util.*;

public class Main {
    public static void main(String[] args) {
//      test case writing
//		String[][] tmp = {{"London","New York"},{"New York","Lima"},{"Lima","Sao Paulo"}};
		String[][] tmp = {{"B","C"},{"D","B"},{"C","A"}};
//		String[][] tmp = {{"A","Z"}};
//		String[][] tmp = {{"pYyNGfBYbm","wxAscRuzOl"},{"kzwEQHfwce","pYyNGfBYbm"}};
//		String[][] tmp = {{"qMTSlfgZlC","ePvzZaqLXj"},{"xKhZXfuBeC","TtnllZpKKg"},{"ePvzZaqLXj","sxrvXFcqgG"},{"sxrvXFcqgG","xKhZXfuBeC"},{"TtnllZpKKg","OAxMijOZgW"}};
//        String[][] tmp = {{"jMgaf WaWA","iinynVdmBz"},{" QCrEFBcAw","wRPRHznLWS"},{"iinynVdmBz","OoLjlLFzjz"},{"OoLjlLFzjz"," QCrEFBcAw"},{"IhxjNbDeXk","jMgaf WaWA"},{"jmuAYy vgz","IhxjNbDeXk"}};
        List paths = new ArrayList<>();

        int index = 0;
        for (String[] str: tmp) {
            paths.add(Arrays.asList(str));
            index++;
        }
        destCity(paths);

    }

    public static String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();

        for(List<String> innerList: paths){
            map.put(innerList.get(0), innerList.get(1));
        }
        System.out.println(map);

        for(Map.Entry entry: map.entrySet()){
            String city = (String)entry.getValue();
            System.out.println(city);

            if(!map.containsKey(city)){
                System.out.println("최종값: "+city);
                return city;
            }

        }
        return "";
    }
}
