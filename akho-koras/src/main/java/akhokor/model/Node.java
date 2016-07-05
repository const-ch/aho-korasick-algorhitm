package akhokor.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kostiantync on 6/29/2016.
 */
public class Node {
    private List<Node> childBranches;
    private Node parentNode;
    private boolean isLeaf=false;
    private char dataChar;

    public Node(Node parentNode, char dataChar,boolean isLeaf) {
        this.parentNode = parentNode;
        this.dataChar = dataChar;
        this.isLeaf = isLeaf;
        childBranches=new ArrayList<Node>();
    }

    public Node(Node parentNode) {
        this.parentNode = parentNode;
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

    public Node getParentNode() {
        return parentNode;
    }

    public void setParentNode(Node parentNode) {
        this.parentNode = parentNode;
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

    public Node getChildForChar(char c){
        return childBranches.stream().filter(
                    branch->c==branch.getDataChar())
                        .findFirst().orElse(null);
    }

    @Override
    public String toString() {
        return dataChar +
                (isLeaf() ? " : leaf" : "");
    }
}