import java.util.*;
class MyHashSet {
  public final int MAX_VALUE=1000000;
      public final int Arrsize=391;
  public List<List<Integer>> partentList;
 
   /** Initialize your data structure here. */
   public MyHashSet() {
    partentList= new ArrayList<>(Arrsize);
       for(int i=0;i<Arrsize;i++){
           partentList.add(null);
       }
   }
 
   public void add(int key) {
     int bucketIndex = key%Arrsize;
       List<Integer> childList=partentList.get(bucketIndex);
       if(childList==null){
           List<Integer> list=new LinkedList<Integer>();
           list.add(key);
               partentList.set(bucketIndex,list);
       }else{
           if(!childList.contains(key)){
              childList.add(key); 
           }
       }
     
   }
   public void remove(int key){
    int bucketIndex = key%Arrsize;
    List<Integer> childList=partentList.get(bucketIndex);
    if(childList!=null){
      if(childList.contains(key)){
        childList.remove(Integer.valueOf(key));
      }
    }
   }

   public boolean contains(int key){
    int bucketIndex = key%Arrsize;
    List<Integer> childList=partentList.get(bucketIndex);
    if(childList!=null && childList.contains(key)){
      return true;
    }else{
      return false;
    }

   }

public static void main(String args[]){

  MyHashSet mh= new MyHashSet();
  mh.add(1);
  mh.add(10);
  mh.add(100);
  mh.add(1000);
  mh.add(10000);
  mh.add(100000);
  mh.add(1000000);
  mh.add(1);
  mh.remove(100);
  boolean res= mh.contains(100000);
  System.out.println(res);

}




  }
 