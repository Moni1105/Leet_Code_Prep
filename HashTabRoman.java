import java.util.*;
public class HashTabRoman {

    public int romanToInt(String s) {
        
    
        int result=0;
        Hashtable<String,Integer> htable=new Hashtable<String,Integer>();
        htable.put("I",1);   
        htable.put("V",5);   
        htable.put("X",10);  
        htable.put("L",50);  
        htable.put("C",100);  
        htable.put("D",500);  
        htable.put("M",1000); 
        int i=0;
while(i<s.length()){

    if(i+1<s.length())
    {
        if(htable.get(Character.toString(s.charAt(i)))<htable.get(Character.toString(s.charAt(i+1)))){
            result+=htable.get(Character.toString(s.charAt(i+1)))-htable.get(Character.toString(s.charAt(i)));
            i=i+2;
        }else{
            result+=htable.get(Character.toString(s.charAt(i)));
            i=i+1;
            

        }
    }
    else{
        result+=htable.get(Character.toString(s.charAt(i)));
        i=i+1;
    }
}


return result;
        }
        
       

    

    public static void main(String args[]){
        HashTabRoman ht= new HashTabRoman();
        int res= ht.romanToInt("MMCMLXXXIX");
        System.out.println(res);

    }
    
}
