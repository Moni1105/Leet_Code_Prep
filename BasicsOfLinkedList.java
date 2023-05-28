import java.util.*;
class BasicsOfLinkedList {

    public static void main(String args[]){
        BasicsOfLinkedList as = new BasicsOfLinkedList();
        LinkedList s= new LinkedList();
        s.add(10);
        s.add(11);
        s.add(12);
        //Types of traversing linked list 
        //1.for loop
        /*for (int n=0;n<s.size();n++){
            System.out.println(s.get(n));
        }*/
//2. while loop
       /* int n=0;
        while(n<s.size()){
            System.out.println(s.get(n));
            n++;
        }*/
        //4.iterartor
      /*  Iterator it = s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/
        s.forEach(
            (element) -> System.out.print(element + " "));
    


    }


}