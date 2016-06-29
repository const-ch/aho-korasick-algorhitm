package akhokor.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kostiantync on 6/29/2016.
 */
public class Node {
    private List<Node> childBranches;
    private Node rootNode;
    private boolean isLeaf=false;
    private char dataChar;

    public Node(Node rootNode, char dataChar,boolean isLeaf) {
        this.rootNode = rootNode;
        this.dataChar = dataChar;
        this.isLeaf = isLeaf;
        childBranches=new ArrayList<Node>();
    }

    public Node(Node rootNode) {
        this.rootNode = rootNode;
        childBranches=new ArrayList<Node>();
    }

    public char getDataChar() {
        return dataChar;
    }

    public void setDataChar(char dataChar) {
        this.dataChar = dataChar;
    }

    public List<Node> getChildBranches() {
        return childBranches;
    }

    public void setChildBranches(List<Node> childBranches) {
        this.childBranches = childBranches;
    }

    public Node getRootNode() {
        return rootNode;
    }

    public void setRootNode(Node rootNode) {
        this.rootNode = rootNode;
    }

    public boolean isLeaf() {
        return isLeaf;
    }

    public void markAsLeaf() {
        this.isLeaf = true;
    }

    public void addNode(Node childNode){
        if(childBranches==null)
            childBranches=new ArrayList<Node>();
        childBranches.add(childNode);
    }
}