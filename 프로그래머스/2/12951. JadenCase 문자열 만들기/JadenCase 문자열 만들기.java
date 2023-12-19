import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String s_modify = s.toLowerCase();
        String[] s_arr = (s_modify.indexOf(" ") > -1) ? s_modify.split(" ", -1) : new String[] { s_modify };
        List<String> s_List = new ArrayList<>();

        for(String item : s_arr){
            if(item.isEmpty()){
                s_List.add("");
                continue;
            }
            
            String firstChr = "";
            String remainChr = "";
            
            switch(item.length()){
                case 1: {
                    s_List.add(item.toUpperCase());
                    break;
                }
                default: {
                    firstChr = item.substring(0, 1);
                    remainChr = item.substring(1);
                    
                    s_List.add(firstChr.toUpperCase() + remainChr);
                    break;
                }                    
            }

        }       
    
        return String.join(" ", s_List);
    }
}