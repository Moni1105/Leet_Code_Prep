import java.util.*;
class SlidinglengthofDistinctSubstring {
    public int lengthOfLongestSubstring(String s) {
 /**********************brute force algorithm************************** */
      /*  int maxlength=0;
        for(int i=0;i<s.length();i++){
            StringBuilder currentsubstring = new StringBuilder();
            for(int j=i;j<s.length();j++){
             if(currentsubstring.indexOf(String.valueOf(s.charAt(j)))!=-1){
                break;
             }
             currentsubstring.append(s.charAt(j));
             maxlength=Math.max(maxlength,currentsubstring.length());

        }
        
    }
    return maxlength;*/

    /**********************SLIDING WINDOW  using hashmap*********************************************** */
     /*int maxlength=0;
     Map<Character,Integer> hmap= new HashMap<Character,Integer>();

     for(int right=0,left=0;right<s.length();right++){
        if(hmap.containsKey(s.charAt(right))&&hmap.get(s.charAt(right))>=left){
            left= hmap.get(s.charAt(right))+1;

        }
        maxlength= Math.max(maxlength,right-left+1);
        hmap.put(s.charAt(right),right);
     }
     return maxlength;*/

     /**********************************sliding window without hashmap******************* */
     int maxlength=0;


     for(int right=0,left=0;right<s.length();right++){
        int indexoffirstappearance=s.indexOf(s.charAt(right),left);
        if(indexoffirstappearance!=right){
            left=indexoffirstappearance+1;
        }
     
        maxlength= Math.max(maxlength,right-left+1);
        
     }
     return maxlength;
}
public static void main(String args[]){
    SlidinglengthofDistinctSubstring as=new SlidinglengthofDistinctSubstring();
    System.out.println(as.lengthOfLongestSubstring("abcabcbb"));
}

}