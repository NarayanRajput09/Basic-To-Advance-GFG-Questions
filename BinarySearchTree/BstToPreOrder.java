class Solution {

    // Function that constructs BST from its preorder traversal.
    public Node preToBST(int pre[]) {
        // code here
        return helper(pre,0,pre.length-1);
        
    }
     public Node helper(int pre[],int st,int end){
         if(st>end){
             return null;
         }
         int rootData = pre[st];
         Node root = new Node(rootData);
         int i;
         for(i = st+1;i<=end;i++){
             if(pre[i]>root.data){
                 break;
             }
         }
         root.left = helper(pre,st+1,i-1);
         root.right = helper(pre,i,end);
         return root;
     }
    
}