package akhokor;

import akhokor.bohr.Bohr;
import akhokor.model.Node;

import java.util.List;

public class DictionaryCheckerUtil {

    public String getWordByLeafNode(Node leaf){
        String result="";
        Node itemNode=leaf;
        while (itemNode.getRootNode()!=null)
        {
            result+= itemNode.getDataChar();
            itemNode=itemNode.getRootNode();
        }
        return result;
    }

    public List<String> checkTextForWords(String text){
        bohr.getRootNode();

        for(char c :text.toCharArray()){
            bohr.getRootNode();
        }
        return null;
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

