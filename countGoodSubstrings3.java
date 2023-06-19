import java.util.*;
class countGoodSubstrings3 {
    public int countGoodSubstrings(String s) {
       //using slidingwindow with hashset  
      /* * String currentsubstring="";
       int count=0;
        for(int i=0;i<s.length();i++){
            currentsubstring+= s.charAt(i);
            if(i>=2){
                char[] ca=currentsubstring.toCharArray();
                Set<Character> hs= new HashSet<Character>();
                int k=0;
                while(k<3){
                hs.add(ca[k]);
                k++;
                }
                if(hs.size()==3){
                    count++;
                }
                currentsubstring=currentsubstring.substring(currentsubstring.length()-2,currentsubstring.length());

            }
        }

        return count;*/
//currentsubstring=currentsubstring.replaceAll("([a-z])", "");

/****************sliding window without extra space******************** */
        String currentsubstring = "";
       int count=0;
       
        for(int i=0;i<s.length();i++){
            boolean flag =true;
                currentsubstring+= s.charAt(i);         
            if(currentsubstring.length()>=3){

               if(currentsubstring.charAt(0)==currentsubstring.charAt(1)||
               currentsubstring.charAt(1)==currentsubstring.charAt(2)
               ||currentsubstring.charAt(0)==currentsubstring.charAt(2))
               {
                flag= false;
               }
               if(flag==true)
               {count++;}
               currentsubstring=currentsubstring.substring(currentsubstring.length()-2,currentsubstring.length());
            }
        
    }
    return count;


    /*******************100% code*********************************
     * 
     * 
     * 
     * int n = s.length();
        if(n<3) return 0;
        int c=0;
        System.out.print(s.charAt(0));
        for(int i =0;i<n-2;i++){
            if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i+1)!=s.charAt(i+2) && s.charAt(i)!=s.charAt(i+2)){
                c++;
            }  
        }
        return c;
    } */
}

    public static void main(String args[]){
        countGoodSubstrings3 as= new countGoodSubstrings3();
        System.out.println(as.countGoodSubstrings("icolgrjedehnd")) ;
    }
}