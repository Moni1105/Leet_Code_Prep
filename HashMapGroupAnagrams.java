import java.util.*;
class HashMapGroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hmap= new HashMap<>();
        for(String s:strs){
            char[] cr=s.toCharArray();
            Arrays.sort(cr);
            String newkey=new String(cr);
            if(!hmap.containsKey(newkey)){
                hmap.put(newkey,new ArrayList<String>());
            }
            hmap.get(newkey).add(s);
        }
        return new ArrayList(hmap.values());
    }
    public static void main(String args[]){
        HashMapGroupAnagrams as= new HashMapGroupAnagrams();
      String[] str= new String[]{"eat","tea","tan","ate","nat","bat"};
      List<List<String>> res=as.groupAnagrams(str);
        System.out.println(res);
    }
}