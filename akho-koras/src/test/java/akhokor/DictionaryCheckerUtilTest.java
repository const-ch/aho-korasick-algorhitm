package akhokor;

import akhokor.bohr.Bohr;
import akhokor.model.Node;
import junit.framework.TestCase;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DictionaryCheckerUtilTest extends TestCase {
    @Test
    public void testGetWordByLeafNode() {
        Node node = new Node(null);
        Node medNode = new Node(node,'a',false);
        Node leafNode = new Node(medNode,'b',true);

        node.addNode(leafNode);
        Bohr bohr = new Bohr(node);
        DictionaryCheckerUtil dictionaryCheckerUtil = new DictionaryCheckerUtil(bohr);
        dictionaryCheckerUtil.getWordByLeafNode(leafNode);
        assertTrue("ab".equals(dictionaryCheckerUtil.getWordByLeafNode(leafNode)));
      }

    @Test
    public void testCheckTextForWords(){
        Bohr bohr = new Bohr( new Node(null,'0',false));
        bohr.addWord("kol");
        bohr.addWord("kol2");
        bohr.addWord("kolpak");
        bohr.addWord("pakistan");
        bohr.addWord("ggj");
        bohr.addWord("a");

        DictionaryCheckerUtil dictionaryCheckerUtil = new DictionaryCheckerUtil(bohr);

        List<String> resList = Arrays.asList("ggj");

        assertEquals(resList, dictionaryCheckerUtil.checkTextForWords("ggjs"));

    }
}
