import java.util.*;
class HashSetcheckIfPangram {
    public boolean checkIfPangram(String sentence) {
        Set<Character> hs=new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            hs.add(sentence.charAt(i));
        }
       return hs.size()==26; 
    }
    public static void main(String args[]){
        HashSetcheckIfPangram as= new HashSetcheckIfPangram();
        System.out.println(as.checkIfPangram("thejumpsoverthelazydog"));
    }
}