public class ListNode {
        int val;
    ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    
        public ListNode middleNode(ListNode head) {
            ListNode middle= head;
        ListNode end= head;
        while(end!=null&&end.next!=null){
           middle=middle.next;
           end=end.next.next;
        }
        return middle;
        
        }

        public ListNode RemoveNthnodefromEnd(ListNode head,int n) {
            ListNode dummy= new ListNode(0);
            dummy.next= head;
            ListNode end= dummy;
            ListNode prev=dummy;
            for ( int i = 1; i <=n+1; i++) {
                end=end.next;    
            }


            while(end!=null){
                end= end.next;
                prev=prev.next;   
             }

             prev.next=prev.next.next;

             return dummy.next;
             
          }

          public ListNode deleteNodes(ListNode head, int m, int n) {

            ListNode current= head;
            ListNode mnodes= head;
            while(current!=null){ // to traverse all elements in the list
            int count =m, cnt=n;
            // to traverse m nodes
            while(current!=null && count!=0){
                mnodes=current;
                current= current.next;
                count--;
            }
            //to traverse n nodes
            while(current!=null && cnt!=0){
                current=current.next;
                cnt--;
            }
            mnodes.next=current;

            }
         
            return head;
             
            
        }

        public int getDecimalValue(ListNode head) {
            String binaryValue="";
            ListNode current= head;
            while(current!=null){
                binaryValue+=current.val;
                current=current.next;
            }

            int decimalval= Integer.parseInt(binaryValue,2);
            return decimalval;
        
        }

       /*  public boolean isPalindrome(ListNode head) {
            String palindrome="";
            String rev="";
            String s2="";
            ListNode end= head;
            ListNode middle= head;
            while(end!=null && end.next!=null){
                palindrome+=middle.val;
                middle= middle.next;
                end=end.next.next;
            }
            while(middle!=null){
                rev+=middle.val;
                middle=middle.next;
            }
            if(palindrome.length()!=rev.length()){
                rev= rev.substring(1,rev.length());
            }
            for(int i=0;i<rev.length();i++){
                s2+=rev.charAt(rev.length()-1-i);

            }
            if(s2.equals(palindrome)){
                return true;
            }else{
                return false;
            }
            
        }*/

        public boolean isPalindrome(ListNode head) {

            if (head == null) return true;
    
            // Find the end of first half and reverse second half.
            ListNode firstHalfEnd = endOfFirstHalf(head);
            ListNode secondHalfStart = reverseList(firstHalfEnd.next);
    
            // Check whether or not there is a palindrome.
            ListNode p1 = head;
            ListNode p2 = secondHalfStart;
            boolean result = true;
            while (result && p2 != null) {
                if (p1.val != p2.val) result = false;
                p1 = p1.next;
                p2 = p2.next;
            }        
    
            // Restore the list and return the result.
            firstHalfEnd.next = reverseList(secondHalfStart);
            return result;
        }
    
        // Taken from https://leetcode.com/problems/reverse-linked-list/solution/
        private ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;
            while (curr != null) {
                ListNode nextTemp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextTemp;
            }
            return prev;
        }
    
        private ListNode endOfFirstHalf(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;
            while (fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }
        



    public static void main(String args[]){
        ListNode as= new ListNode(1);
        ListNode as1= new ListNode(2);
        ListNode as2= new ListNode(2);
        ListNode as3= new ListNode(1);
        as.next=as1;
        as1.next=as2;
        as2.next=as3;
        as3.next=null;
      
        /*   ListNode as= new ListNode(1);
        ListNode as1= new ListNode(2);
        ListNode as2= new ListNode(3);
        ListNode as3= new ListNode(4);
        ListNode as4= new ListNode(5);
        ListNode as5= new ListNode(6);
        ListNode as6= new ListNode(7);
        ListNode as7= new ListNode(8);
        ListNode as8= new ListNode(9);
        ListNode as9= new ListNode(10);
        ListNode as10= new ListNode(11);
        ListNode as11= new ListNode(12);
        ListNode as12= new ListNode(13);
        as.next=as1;
        as1.next=as2;
        as2.next=as3;
        as3.next=as4;
       as4.next=as5;
       as5.next=as6;
       as6.next=as7;
       as7.next=as8;
       as8.next=as9;
       as9.next=as10;
       as10.next=as11;
       as11.next=as12;
       as12.next=null;*/


       // ListNode mid=  as.middleNode(as);
        //ListNode del=  as.RemoveNthnodefromEnd(as,1);
        //System.out.println(mid.val);
     // int dec=  as.getDecimalValue(as);
      //System.out.println(dec);
     // ListNode del=  as.deleteNodes(as,3,1);
      //printing the linkedlist
      boolean k=as.isPalindrome(as);
      System.out.println(k);
        ListNode current =as;
        while(current!=null)
        {
            System.out.println(current.val);
            current= current.next;
        }

    }

}
/* int left= 0;
            int right= ar.length-1;
            while(left<right){
                char temp= ar[left];
                ar[left]=ar[right];
                ar[right]=temp;
                left++;
                right--;
            } */


            /*String s1="",s2="";
            if(palindrome.length()%2==0){
                 s1=palindrome.substring(0,palindrome.length()/2);
                 s2=palindrome.substring(palindrome.length()/2,palindrome.length());
            }else{
                 s1=palindrome.substring(0,palindrome.length()/2+1);
                 s2=palindrome.substring(palindrome.length()/2,palindrome.length());
            }
            for(int i=0;i<s2.length();i++){
                  rev+=s2.charAt(s2.length()-1-i);
            }
            System.out.println(s1);
            System.out.println(rev);
            if(Integer.parseInt(s1)==Integer.parseInt(rev)){
                return true;
            }else{
                return false;
            }
 */