import java.util.ArrayList;
import java.util.Stack;

public class PreOrder_Traversal {
    class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} 

    // Return a list containing the Preorder traversal of the given tree
    ArrayList<Integer> preOrder(Node root)
    {
        Stack<Node> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        Node curr=root;
        while(true){
            if(curr!=null){
                st.push(curr);
                ans.add(curr.data);
                curr=curr.left;
            }else{
                if(st.isEmpty()) break;
                curr=st.pop();
                curr=curr.right;
            }
        }
        return ans;
    }
}

