/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        List<Integer> ans=new ArrayList<>();
        TreeNode node=root;
        while(true){
            if(node!=null){
                st.push(node);
                node=node.left;
            }else{
                if(st.isEmpty()) break;
                node =st.pop();
                ans.add(node.val);
                node=node.right;
            }
        }
        return ans;
    }
}
/*
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
       Stack<TreeNode> stack=new Stack<>();
       TreeNode curr=root;
       while (curr!=null||!stack.isEmpty()){
        while(curr!=null){
            stack.push(curr);
            curr=curr.left;
        }
        curr=stack.pop();
        res.add(curr.val);
        curr=curr.right;
       }
       return res;
    }
} */