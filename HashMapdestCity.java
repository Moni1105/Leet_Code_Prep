import java.util.*;
class HashMapdestCity {
    public String destCity(List<List<String>> paths) {
        Map<String,String> hmap= new HashMap<>();
        for(int i=0;i<paths.size();i++){
            hmap.put(paths.get(i).get(0),paths.get(i).get(1));
        }
        for(int i=0;i<paths.size();i++){
        if(!hmap.containsKey(paths.get(i).get(1))){
            return paths.get(i).get(1);
        }
        }
        return "";

        
    }
    public static void main(String args[]){
        HashMapdestCity as= new HashMapdestCity();
        //String[][] path= new String[][]{{"London","New York"},{"New York","Lima"},{"Lima","Sao Paulo"}};
        List<List<String>> paths= new ArrayList<>();
 paths.add(new ArrayList(Arrays.asList("A","Z")));
    // paths.add(new ArrayList(Arrays.asList("London","New York")));
    // paths.add(new ArrayList(Arrays.asList("New York","Lima")));
     //paths.add(new ArrayList(Arrays.asList("Lima","Sao Paulo")));
    
        System.out.println(as.destCity(paths));
    }
}