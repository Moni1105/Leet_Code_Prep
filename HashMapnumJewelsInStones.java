import java.util.*;
class HashMapnumJewelsInStones {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character,Integer> hm= new HashMap<>();
        char[] ch= stones.toCharArray();
        int len= ch.length;
        while(len-1>=0){
            hm.put(ch[len-1],hm.getOrDefault(ch[len-1],0)+1);
            len--;
        }
        int Count=0;
        for(int i=0;i<jewels.length();i++){
            if(hm.containsKey(jewels.charAt(i))){
             Count+=hm.get(jewels.charAt(i));
            }
        
        }
    return Count;
        
    }
    public static void main(String args[]){
        HashMapnumJewelsInStones as= new HashMapnumJewelsInStones();
        System.out.println(as.numJewelsInStones("z","ZZ"));
    }

}