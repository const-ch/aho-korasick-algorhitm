package akhokor.bohr;

import akhokor.model.Node;

/**
 * Created by User on 28.06.16.
 */
public class Bohr {
    public void addWord(String word){
        Node nextNode = rootNode;
        for(int i = 0; i<word.length();i++){
            for(Node n : rootNode.getBranchNodes()){
                if(n.getC()==word.charAt(i))
                  nextNode
            }
        }
    }
    public Node getRootNode() {
        return rootNode;
    }

    public void setRootNode(Node rootNode) {
        this.rootNode = rootNode;
    }

    private Node rootNode;
}
