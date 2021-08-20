/**
 * The inputs of this question are two binary tree as two arrays
 * One array is the result of in-order tree and the other one is tree in pre-order
 * And the goal of this program is to rebuild the tree
 * */

public class Q7BuildBinaryTree {
    private int[] pre;
    private int[] inOrder;
    public Q7BuildBinaryTree(int[] input_pre, int[] input_in){
        this.pre = input_pre;
        this.inOrder = input_in;
    }
    private void buildTree(){
        int left;
        int right;
        int length = this.pre.length;
        int[] ans = new int[length];
        int root = pre[0]; // get the root then we need to find the root in the array of in order
        BinaryNode rt = new BinaryNode(pre[0]);
        int rootIndex= 0;
        for(int i=0; i<length; ++i){
            if(inOrder[i]==root){
                rootIndex = i;
            }
        }
        left = rootIndex;
        right = length - rootIndex-1;




    }
    public class BinaryNode{
        BinaryNode parent;
        BinaryNode[] children;
        int value;
        public BinaryNode(int value){
            this.value = value;
        }
        public BinaryNode(int value, BinaryNode parent, BinaryNode[] children){
            this.value = value;
            this.parent = parent;
            this.children = children;
        }

    }


    public static void main(String[] args) {
        int[] input_pre={1,2,4,7,3,5,6,8};
        int[] input_in = {4,7,2,1,5,3,8,6};
        Q7BuildBinaryTree q7 = new Q7BuildBinaryTree(input_pre, input_in);
        q7.buildTree();
    }


}
