import java.util.*;
class Maxvowelslengthinstring {
    public int maxVowels(String s, int k) {
        int max=0;
        int count=0;
String vowels="aeiou";
        for(int i=0;i<s.length();i++){
            count+=vowels.contains(Character.toString(s.charAt(i)))?1:0;
            if(i>=k-1){
                max=Math.max(count,max);
                count-=vowels.contains(Character.toString(s.charAt(i-(k-1))))?1:0;
            }
        }
        return max;
    }

    public static void main(String args[]){
        Maxvowelslengthinstring as= new Maxvowelslengthinstring();
        int res=as.maxVowels("abciiidef",3);
        System.out.println(res);
    
    }
}