import java.util.*;
class HashMapcanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
    
        Map<Character,Integer> ransom= getFrequencies(ransomNote);
        Map<Character,Integer> mag= getFrequencies(magazine);
        for(Character key:ransom.keySet()){
            if(!mag.containsKey(key)){
                return false;
            }else{
                if(!(mag.get(key)>=ransom.get(key)))
                {
                  return false;
                }
            }

        }
        return true;
        
    }
    public Map<Character,Integer> getFrequencies(String s){
          Map<Character,Integer> hm= new HashMap<>();
        char[] ch= s.toCharArray();
        int len=ch.length;
        while(len-1>=0){
            hm.put(ch[len-1],hm.getOrDefault(ch[len-1],0)+1);
            len--;
        }
        return hm;
    }
     public static void main(String args[]){
        HashMapcanConstruct as= new HashMapcanConstruct();
        System.out.println(as.canConstruct("bg",
                "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
    }
}