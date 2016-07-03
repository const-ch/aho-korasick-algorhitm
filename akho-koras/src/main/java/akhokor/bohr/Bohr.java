package akhokor.bohr;

import akhokor.model.Node;

/**
 * Created by User on 28.06.16.
 */
public class Bohr {

    private Node rootNode = new Node(null);

    public Bohr(Node rootNode) {
        this.rootNode = rootNode;
    }

    public void addWord(String word){
        Node nextBranch = rootNode;
        for(int i = 0;i<word.length();i++){
            nextBranch = getNodeForChar(word.charAt(i), nextBranch, i == word.length() - 1);
        }
    }

    private Node getNodeForChar(char targetChar,Node parentNode, boolean isLeaf){
        for(Node chilNode : parentNode.getChildBranches()){
            if(chilNode.getDataChar()==targetChar){
                if(isLeaf)
                    chilNode.markAsLeaf();
                return chilNode;
            }
        }
        Node nextNode = new Node(parentNode,targetChar,isLeaf);
        parentNode.addNode(nextNode);
        return nextNode;
    }

    public Node getRootNode() {
        return rootNode;
    }

    public void setRootNode(Node rootNode) {
        this.rootNode = rootNode;
    }
}