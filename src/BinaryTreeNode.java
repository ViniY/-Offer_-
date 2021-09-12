import com.sun.source.tree.BinaryTree;

public class BinaryTreeNode {
    double value = 0;
    private BinaryTreeNode left= null;
    private BinaryTreeNode right = null;
    private BinaryTreeNode parent = null;
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
    public void setRightNode(BinaryTreeNode right){
        this.right = right;
    }

    public void setParent(BinaryTreeNode parent){
        this.parent = parent;
    }


    public BinaryTreeNode getRightNode(){
        return left;
    }

    public BinaryTreeNode getLeftNode(){
        return right;
    }

    public void setValue(double value){
        this.value = value;

    }

    public double getValue(){
        return this.value;

    }

    public BinaryTreeNode getParent(){
        return this.parent;
    }


}
