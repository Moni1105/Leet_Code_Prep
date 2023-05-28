public class Reversestring {
    String revname="";
    public void rev(String str)
    {if ((str==null)||(str.length() <= 1))
        System.out.println(str);
     else
     {
       
         System.out.print(str.charAt(str.length()-1));        
         rev(str.substring(0,str.length()-1));
     }
       
    }
    public static void main(String[] args){
        Reversestring rs = new Reversestring();
     rs.rev("maha");
       
    }
}
