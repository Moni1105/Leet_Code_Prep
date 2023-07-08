import java.util.*;
class HashSetisPathCrossing {
    public boolean isPathCrossing(String path) {
        int x=0;
        int y=0;
        Set<String> hs= new HashSet<>();
        String coordinates=x+","+y;
        hs.add(coordinates);
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='N'){
                y+=1;
            }else if(path.charAt(i)=='S'){
                y-=1;
            }else if(path.charAt(i)=='E'){
                x+=1;
            }else{
                x-=1;
            }
                coordinates=x+","+y;
                if(hs.contains(coordinates)){
                    return true;
                }
hs.add(coordinates);

        }
        return false;
    }
     public static void main(String args[]){
        HashSetisPathCrossing as= new HashSetisPathCrossing();
        System.out.println(as.isPathCrossing("NES"));
    }
}