

public class BSTSearchPreOrder {
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length == 0){
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        bst(preorder, 1, root, Integer.MAX_VALUE);
        return root;

    }

    public int bst(int[] preorder, int i, TreeNode root, int bound){
        if(i < preorder.length && preorder[i]<root.val ){
            root.left = new TreeNode(preorder[i]);
            i++;
            i = bst(preorder, i, root.left, root.val);
        }

        if(i < preorder.length && preorder[i] > root.val && preorder[i] < bound){
            root.right = new TreeNode(preorder[i]);
            i++;
            i = bst(preorder, i, root.right, bound);
        }
        return i;

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}