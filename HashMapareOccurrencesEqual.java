import java.util.*;
class HashMapareOccurrencesEqual {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        
       for(int i=0;i<s.length();i++) {
        hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
       }
       Set<Integer> hs= new HashSet<>(hm.values());
     return hs.size()==1;
    }
    public static void main(String args[]){
        HashMapareOccurrencesEqual as= new HashMapareOccurrencesEqual();
        System.out.println(as.areOccurrencesEqual("abcbc"));
    }
}