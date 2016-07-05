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
        Node nextNode;
        Node prevNode=bohr.getRootNode();
        int i= 0;
        do{
            currentChar = text.charAt(i);
            nextNode=prevNode.getChildForChar(currentChar);
            if(nextNode==null){
                prevNode=bohr.getRootNode();
            }
            else
            {
                if(nextNode.isLeaf()){
                    resWordsList.add(getWordByLeafNode(nextNode));
                    prevNode=bohr.getRootNode();
                }else
                    prevNode=nextNode;
            }
            i++;
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

