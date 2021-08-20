import java.util.ArrayList;

public class Node {
    Node parent;
    ArrayList<Node> children = new ArrayList<>();
    int numChild = 0;
    int depth;
    int value;
    int nodeId = 0;

    public Node(Node parent, int value){
        this.parent = parent;
        this.value = value;
    }
    public Node(Node parent, int id, int value, int depth){
        this.parent = parent;
        this.nodeId = id;
        this.value = value;
        this.depth = depth;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public ArrayList<Node> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Node> children) {
        this.children = children;
    }

    public int getNumChild() {
        this.numChild = this.children.size();
        return numChild;
    }

    public void setNumChild(int numChild) {
        this.numChild = numChild;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getNodeId() {
        return nodeId;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    public void drawTree(Node root){


    }
}
