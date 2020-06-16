class Solution {
    public boolean solution(String s) {
        s = s.replaceAll(" ", "");
        if(s.length() >= 1 && s.length() <= 8){
            if (s.length() == 4 || s.length() == 6){
                try {
                    Integer.parseInt(s);
                    return true;
                } catch(NumberFormatException e){
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}