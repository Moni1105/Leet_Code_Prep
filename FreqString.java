import java.util.*;
class FreqString {
    public boolean checkAlmostEquivalent(String word1, String word2) {
Map<String,Integer> mp=new HashMap<String,Integer>();
Map<String,Integer> mp1=new HashMap<String,Integer>();
for(int i=0;i<word1.length();i++){
    mp.put(Character.toString(word1.charAt(i)),mp.getOrDefault(Character.toString(word1.charAt(i)),0)+1);   
    mp.put(Character.toString(word2.charAt(i)),mp.getOrDefault(Character.toString(word2.charAt(i)),0)-1);   
}
for(int i:mp.values()){
    if(i>3||i<-3)
    {
        return false;
    }
    }


//System.out.println(mp);
//System.out.println(mp1);

        return true;
        
    }



    public static void main(String args[])
    {
        FreqString fs= new FreqString();
        boolean res=fs.checkAlmostEquivalent("abcdeef","abaaacc");
        System.out.println(res);
        
    }
}