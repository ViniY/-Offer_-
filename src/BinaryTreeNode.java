import com.sun.source.tree.BinaryTree;

public class BinaryTreeNode {
    double value = 0;
    BinaryTreeNode left= null;
    BinaryTreeNode right = null;
    BinaryTreeNode parent = null;
    public BinaryTreeNode(double value) {
        this.value = value;
    }
    public BinaryTreeNode(double value, BinaryTreeNode parent, BinaryTreeNode left, BinaryTreeNode right){
        this.value = value;
        this.parent = parent;
        this.left = left;
        this.right = right;
    }
    public BinaryTreeNode(double value, BinaryTreeNode parent){
        this.value = value;
        this.parent = parent;
    }
    private void setLeftNode(BinaryTreeNode left){
        this.left = left;

    }
    private void setRightNode(BinaryTreeNode right){
        this.right = right;
    }

    private void setParent(BinaryTreeNode parent){
        this.parent = parent;
    }

    private void setValue(double value){
        this.value = value;

    }

    private double getValue(){
        return this.value;

    }

    private BinaryTreeNode getParent(){
        return this.parent;
    }


}
