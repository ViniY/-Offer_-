/**
 * The inputs of this question are two binary tree as two arrays
 * One array is the result of in-order tree and the other one is tree in pre-order
 * And the goal of this program is to rebuild the tree
 *
 *
 * First we need to find the root node then find the left branch and the right branch of the tree
 * Fiding nodes for each branch we need to use the list in in-order
 * Then use the preorder to build the tree.
 * */

public class Q7BuildBinaryTree {
    private int[] pre; // The tree built in preorder
    private int[] inOrder; // The tree built in inorder
    public Q7BuildBinaryTree(int[] input_pre, int[] input_in){
        this.pre = input_pre;
        this.inOrder = input_in;
    }
    private void buildTree() {
        double left; //left node value
        double right; // right tree value
        int length = this.pre.length;
        double[] ans = new double[length];
        double root = pre[0]; // get the root then we need to find the root in the array of in order
        int rootIndex = 0;
        for (int i = 0; i < length; ++i) {
            if (inOrder[i] == root) {
                rootIndex = i;
            }
        }
        BinaryTreeNode rootNode = new BinaryTreeNode(root);
        rootNode.setValue(root);
    }


    public static void main(String[] args) {
        int[] input_pre={1,2,4,7,3,5,6,8};
        int[] input_in = {4,7,2,1,5,3,8,6};
        Q7BuildBinaryTree q7 = new Q7BuildBinaryTree(input_pre, input_in);
        q7.buildTree();
    }


}
