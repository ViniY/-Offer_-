import java.util.ArrayList;
import java.util.List;

public class BinaryTreePrinter {
    BinaryTreeNode root;
    ArrayList<Double> values = new ArrayList<>();
    public BinaryTreePrinter(BinaryTreeNode root, String order){
        order = order.toLowerCase();
        if (order.equals("inorder")){
        }
        this.root = root;
    }

    public void getValuesInorder(BinaryTreeNode n){
        if (n.left==null){
            return;
        }
        getValuesInorder(n.left);
        values.add(n.value);
        getValuesInorder(n.right);
    } 

    public void inOrderSoter(){


    }
    public void printer(){



    }

    public static void main(String[] args) {

    }

}
