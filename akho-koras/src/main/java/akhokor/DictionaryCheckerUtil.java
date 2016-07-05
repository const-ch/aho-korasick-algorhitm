package akhokor;

import akhokor.bohr.Bohr;
import akhokor.model.Node;

import java.util.ArrayList;
import java.util.List;

public class DictionaryCheckerUtil {

    public String getWordByLeafNode(Node leaf){
        String result="";
        Node itemNode=leaf;
        while (itemNode.getParentNode()!=null)
        {
            result=itemNode.getDataChar()+result;
            itemNode=itemNode.getParentNode();
        }
        return result;
    }

    public List<String> checkTextForWords(String text){
        List<String> resWordsList = new ArrayList<String>();
        char currentChar;
        Node iterNode = bohr.getRootNode().getChildForChar(text.charAt(0));
        iterNode=iterNode==null ? bohr.getRootNode() : iterNode;
        int i= -1;
        do{
            i++;
            if(iterNode.isLeaf())
                resWordsList.add(getWordByLeafNode(iterNode));
            if(iterNode.getChildBranches().isEmpty())
            {
                iterNode=bohr.getRootNode();
            }else {
                currentChar = text.charAt(i);
                iterNode=iterNode.getChildForChar(currentChar);
                if(iterNode==null)
                    iterNode=bohr.getRootNode();
            }
        }while (i<text.length());
        return resWordsList;
    }

    public Bohr getBohr() {
        return bohr;
    }

    public void setBohr(Bohr bohr) {
        this.bohr = bohr;
    }

    public DictionaryCheckerUtil(Bohr bohr) {
        this.bohr = bohr;
    }

    private Bohr bohr;

}

