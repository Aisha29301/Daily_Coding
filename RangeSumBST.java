class TreeNode {
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
 }
public class RangeSumBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return 0;

        //within range
        if(root.val >= low && root.val <= high)
            return root.val + rangeSumBST(root.left,low,high) + rangeSumBST(root.right,low,high);
        
        //root->val < low (waste to go left,so right)
        if(root.val < low) return rangeSumBST(root.right,low,high);

        //root->val > high (waste to go right, so left)
        return rangeSumBST(root.left,low,high);
    }
    public static void main(String[] args) {
        // Example usage:
        // Construct a sample BST:
        //        10
        //       /  \
        //      5   15
        //     / \    \
        //    3   7    18
        TreeNode root = new TreeNode(10,
                new TreeNode(5, new TreeNode(3), new TreeNode(7)),
                new TreeNode(15, null, new TreeNode(18)));

        RangeSumBST rangeSumBST = new RangeSumBST();
        
        int low = 7;
        int high = 15;
        
        int result = rangeSumBST.rangeSumBST(root, low, high);
        
        System.out.println("The sum of values in the range [" + low + ", " + high + "] is: " + result);
    }
}
