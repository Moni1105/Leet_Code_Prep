
public class VersionControl{
   public boolean isBadVersion(int version){
    if(version<1702766719){
        return false;
    }else{
        return true;
    }
   }

  }