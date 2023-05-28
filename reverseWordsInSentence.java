import java.lang.*;

class reverseWordsInSentence {
    public String reverseWords(String s) {

        String[] sa =s.split(" ");
        String snew="";
        for(int i=0; i<sa.length;i++){
            char[] c= new char[sa[i].length()];
            int k=0;
            while(k<sa[i].length()){
                c[k]=sa[i].charAt(sa[i].length()-1-k);
                k++;
            }
            snew+=sa[i].valueOf(c)+" ";
            
        }
    return snew.substring(0,snew.length()-1);
    }
    public static void main(String[] args){
        reverseWordsInSentence rs = new reverseWordsInSentence();
     String res=rs.reverseWords("Let's take LeetCode contest");
     System.out.print(res);    
    }
}