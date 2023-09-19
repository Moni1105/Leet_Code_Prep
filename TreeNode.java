import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import org.w3c.dom.Node;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
      List<Integer> list= new ArrayList<>();
    public void dfs(TreeNode node){
        if(node==null){
            return;
        }
        //System.out.println(" starting "+node.val);
        dfs(node.left);
         System.out.println(" done with left "+node.val);
        dfs(node.right);
        // System.out.println(" done with right "+node.val);
         return;

       
    }
    public int maxDepthbottomup(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int left = maxDepthbottomup(root.left);
        int right = maxDepthbottomup(root.right);
        return Math.max(left, right) + 1;
    }
    private int topdownoutput=0;
    public int maxDepthTopDown(TreeNode root, int depth) {
        if(root==null){
            return 0;
        }
        
        if(root.left==null&&root.right==null){
         topdownoutput=Math.max(topdownoutput,depth);

        }
        
      maxDepthTopDown(root.left,depth+1);
       maxDepthTopDown(root.right,depth+1);
       return topdownoutput;
       
    }

    public int maxDepthIterative(TreeNode root) {
      
            Queue<Integer> queuedepth= new ArrayDeque<Integer>();
           Queue<TreeNode> queuetree= new LinkedList<TreeNode>();
           if(root==null){
               return 0;
           }
           queuetree.add(root);
           int depth =1, ans=0;
           queuedepth.add(1);
           while(!queuetree.isEmpty()){
               TreeNode curr= queuetree.poll();
               depth=queuedepth.poll();
               ans= Math.max(ans,depth);
               if(curr.left!=null){
                   queuetree.add(curr.left);
                   queuedepth.add(depth+1);
               }
               if(curr.right!=null){
                   queuetree.add(curr.right);
                   queuedepth.add(depth+1);
               }
           }
   
   return ans;    
       }

       public int balanceTree(TreeNode root){
        if(root==null){
            return 0;
        }
        int lefttree=balanceTree(root.left);
           if(lefttree==-1) return -1;
        int righttree=balanceTree(root.right);
        if(righttree==-1) return -1;
        int diff=Math.abs(righttree-lefttree);
        if(diff>1){
            return -1;
        }
        return Math.max(righttree, lefttree)+1;
        
       }
  private int diaMax=0;
       public int diametertree(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftheight=diametertree(root.left);
        int rightheight=diametertree(root.right);
        diaMax=Math.max(diaMax,leftheight+rightheight);
        return Math.max(leftheight,rightheight)+1;
       }
       public int diameterOfBinaryTree(TreeNode root) {
        diametertree(root);
        return diaMax;
        
       }
       private int maxpath=Integer.MIN_VALUE;
       public int maxsum(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftsum=Math.max(0,maxsum(root.left));
        int rightsum=Math.max(0,maxsum(root.right));
        int sum= leftsum+rightsum+root.val;
        maxpath=Math.max(maxpath, sum);
        return Math.max(leftsum,rightsum)+root.val;

       }

       public int maxPathSum(TreeNode root) {
        maxsum(root);
        return maxpath;

        
       }


       public boolean isBalanced(TreeNode root) {
       return balanceTree(root)!=-1;
       }

      
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if(p==null && q==null){
                return true;
            }
            if(p==null || q==null){
                return false;
            }
    
          return  (p.val==q.val)&&isSameTree(p.left,q.left)&& isSameTree(p.right,q.right);
    
    }
 /*    public  ArrayList < ArrayList < Integer >> zigzagLevelOrder(TreeNode root) {
        Queue < TreeNode > que = new ArrayDeque< TreeNode > ();
        ArrayList < ArrayList < Integer >> wrapList = new ArrayList < > ();
        if (root == null) return wrapList;
        que.add(root);
        boolean flag = true;
        while (!que.isEmpty()) {
            int levelNum = que.size();
            ArrayList < Integer > subList = new ArrayList < Integer > (levelNum);
            for (int i = 0; i < levelNum; i++) {
                //int index = levelNum-i;
                if (que.peek().left != null) que.offer(que.peek().left);
                if (que.peek().right != null) que.offer(que.peek().right);
                if (flag == true) subList.add(que.poll().val);
                else subList.add(0, que.poll().val);
            }
            flag = !flag;
            wrapList.add(subList);
        }
        return wrapList;
    }*/


    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> zigque= new ArrayDeque<TreeNode>();
        List<List<Integer>> ML= new ArrayList<>();
        zigque.add(root);
        boolean flag=false;
        while(!zigque.isEmpty()){     
        int zigquesize=zigque.size();
        List<Integer> SL= new ArrayList<>();
        for(int i=0;i<zigquesize;i++){
            TreeNode currNode= zigque.poll();
            SL.add(currNode.val);
            if(currNode.left!=null) zigque.add(currNode.left);
            if(currNode.right!=null) zigque.add(currNode.right);

        }
        if(flag==false){
            ML.add(SL);
        }else{
            Collections.reverse(SL);
            ML.add(SL);
        }
        flag=!flag;
        
        }
        return ML;         
    }
        
    

       
   

     public List<Integer> preorderTraversal(TreeNode root) {
      
        if(root==null){
            return new ArrayList<>();
        }
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        
       return list; 
        
        
    }

    public void Inorderdfs(TreeNode root){
        if(root==null){
            return;
        }
        Inorderdfs(root.left);
        list.add(root.val);
        Inorderdfs(root.right);

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        /*****************recursion********* */
       // Inorderdfs(root);
       // return list;
       /***************iteration************************ */
       List<Integer> res = new ArrayList<>();
       Stack<TreeNode> stack = new Stack<>();
       TreeNode curr = root;
       while (curr != null || !stack.isEmpty()) {
           while (curr != null) {
               stack.push(curr);
               curr = curr.left;
           }
           curr = stack.pop();
           res.add(curr.val);
           curr = curr.right;
       }
       return res;
    }
    public void postdfs(TreeNode root){
        if(root==null){
            return;
        }
        postdfs(root.left);
        postdfs(root.right);
        list.add(root.val);

    }
    public List<Integer> postorderTraversal(TreeNode root) {
          /*****************recursion********* */
        postdfs(root);
        return list;

        /************************iteration******************* */
      /*  LinkedList<Integer> output = new LinkedList();
        Stack<TreeNode> sk= new Stack<>();
        sk.push(root);
        while(!sk.isEmpty()){
            root=sk.pop();
            output.addFirst(root.val);
            if(root.left!=null)sk.push(root.left);
             if(root.right!=null)sk.push(root.right);
        }
return output;*/
    }

    List<List<Integer>> levels = new ArrayList<List<Integer>>();

    public void helper(TreeNode node, int level) {
        // start the current level
        if (levels.size() == level)
            levels.add(new ArrayList<Integer>());

         // fulfil the current level
         levels.get(level).add(node.val);

         // process child nodes for the next level
         if (node.left != null)
            helper(node.left, level + 1);
         if (node.right != null)
            helper(node.right, level + 1);
    }
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return levels;
        helper(root, 0);
        return levels;
    }

    public List<Integer> DFSIteration(TreeNode root){
        Stack<TreeNode> skdfsI= new Stack<>();
        List<Integer> dfsI= new ArrayList<>();
        skdfsI.add(root);
        while(!skdfsI.isEmpty()){
           TreeNode currNode= skdfsI.pop();
           dfsI.add(currNode.val);
           if(currNode.right!=null) skdfsI.add(currNode.right);
           if(currNode.left!=null) skdfsI.add(currNode.left);
        }
        return dfsI;

    }
    public List<Integer> PostDFSIterationArrayList(TreeNode root){
        Stack<TreeNode> sk1= new Stack<>();
        List<Integer> al1= new ArrayList<>();
        TreeNode cur=root;
        while(cur!=null ||!sk1.isEmpty()){
            if(cur!=null){
                sk1.add(cur);
                cur=cur.left;
            }else{
              TreeNode  temp=sk1.peek().right;
              if(temp==null){
                temp=sk1.peek();
                sk1.pop();
                al1.add(temp.val);
                while(!sk1.isEmpty()&& temp==sk1.peek().right){
                    temp=sk1.peek();
                sk1.pop();
                al1.add(temp.val);

                }
              }else{
                cur=temp;
              }

            }
        }
        return al1;
    }

    public boolean isLeaf(TreeNode root){
        return root.left==null&&root.right==null;
    }
    public void addleftBoundary(List<Integer> res, TreeNode root){
        TreeNode cur=root.left;
        while(cur!=null){
        if(isLeaf(cur)==false) res.add(cur.val);
        if(cur.left!=null) cur=cur.left;
        else cur=cur.right;}
    }
     
    public void addLeaves(List<Integer> res,TreeNode root){
        if(isLeaf(root)==true){
            res.add(root.val);
           return;
        }
        if(root.left!=null) addLeaves(res, root.left);
        if(root.right!=null)addLeaves(res, root.right);
    }

    public void addrightBoundary(List<Integer> res,TreeNode root){
        TreeNode cur= root.right;
      Stack<Integer> temp= new Stack<>();
      while(cur!=null){
        if(isLeaf(cur)==false){
            temp.add(cur.val);
        }
        if(cur.right!=null)cur=cur.right;
        else cur=cur.left;
    }
     while(!temp.isEmpty()){
        res.add(temp.pop());
     }
    }



    public List<Integer> boundaryOfBinaryTree(TreeNode root) {

        ArrayList<Integer> al= new ArrayList<>();
        if(root==null){
            return al;
        }
       if(isLeaf(root)==false){
        al.add(root.val);
       }
       addleftBoundary(al,root);
       addLeaves(al, root);
       addrightBoundary(al,root);
       return al;
  
    }

    

    public static void main(String args[]){
        TreeNode root= new TreeNode(0);
        TreeNode t1= new TreeNode(1);
        TreeNode t2= new TreeNode(2);
        TreeNode t3= new TreeNode(3);
        TreeNode t4= new TreeNode(4);
        TreeNode t5= new TreeNode(5);
        TreeNode t6= new TreeNode(6);
         root.left= t1;
            root.right= t2;
        t1.left=t3;
        t1.right=t4;
        t2.right=t5;
        t2.left=null;
        t5.right=t6;
        t5.left=null;
        t6.left=null;
        t6.right=null;
        t3.left=null;
        t3.right=null;
        t4.left=null;
        t4.right=null;
      /*   TreeNode rroot= new TreeNode(2);
        TreeNode tt1= new TreeNode(-1);
        TreeNode tt2= new TreeNode(2);
        TreeNode tt3= new TreeNode(3);
        TreeNode tt4= new TreeNode(4);
        TreeNode tt5= new TreeNode(5);
        TreeNode tt6= new TreeNode(6);
         rroot.left= tt1;
            rroot.right= tt2;
        tt1.left=null;
        tt1.right=tt4;
        tt2.right=tt5;
        tt5.right=tt6;*/

       // t1.dfs(t1);
       System.out.print(root.boundaryOfBinaryTree(root));
       //System.out.print(root.PostDFSIterationArrayList(root));
       //System.out.print(root.DFSIteration(root));
       //System.out.print(root.zigzagLevelOrder(root));
       //System.out.print(root.isSameTree(root,rroot));
       //System.out.println(root.maxPathSum(root));
       //System.out.println(root.diameterOfBinaryTree(root));
       //System.out.println(root.isBalanced(root));
        //System.out.println(root.maxDepthIterative(root));
       //System.out.println(root.maxDepthbottomup(root));
      // System.out.println(root.maxDepthTopDown(root,1));
       //List<Integer> res= root.preorderTraversal(root);
       //List<Integer> res= root.inorderTraversal(root);
       //List<Integer> res= root.postorderTraversal(root);
      /*List<List<Integer>> li=root.levelOrder(root);
      
       for(int i=0;i<li.size();i++){
           System.out.print(i);
       }*/
      

    }
}