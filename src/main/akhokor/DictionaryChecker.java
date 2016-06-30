package main.akhokor;

import main.akhokor.bohr.Bohr;
import main.akhokor.model.Node;

import java.util.List;

public class DictionaryChecker {

    public String getWordByLeafNode(Node leaf){
        String result="";
        Node itemNode=leaf;
        while (itemNode!=null)
        {
            result+= itemNode.getDataChar();
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

    public DictionaryChecker(Bohr bohr) {
        this.bohr = bohr;
    }

    private Bohr bohr;

}

