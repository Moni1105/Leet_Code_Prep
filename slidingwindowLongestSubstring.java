import java.util.*;
class slidingwindowLongestSubstring {
        public int lengthOfLongestSubstring(String s) {
            int n = s.length();
    
            int res = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    if (checkRepetition(s, i, j)) {
                        res = Math.max(res, j - i + 1);
                    }
                }
            }
    
            return res;
        }
    
        private boolean checkRepetition(String s, int start, int end) {
            Set<Character> chars = new HashSet<>();
    
            for (int i = start; i <= end; i++) {
                char c = s.charAt(i);
                if(chars.contains(c)){
                    return false;
                }
                chars.add(c);
            }
    
            return true;
        }
    

    public static void main(String args[]){
        slidingwindowLongestSubstring as= new slidingwindowLongestSubstring();
        int res=as.lengthOfLongestSubstring("dvdf");
        System.out.println(res);
    }
}