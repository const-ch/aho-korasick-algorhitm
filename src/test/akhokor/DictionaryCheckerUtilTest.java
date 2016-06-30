package test.akhokor;

import junit.framework.TestCase;
import main.akhokor.DictionaryCheckerUtil;
import main.akhokor.bohr.Bohr;
import main.akhokor.model.Node;
import org.junit.Test;
import org.junit.runners.model.TestClass;

/**
 * Created by kostiantync on 6/30/2016.
 */
public class DictionaryCheckerUtilTest extends TestCase{
    @Test
    public void testGetWordByLeafNode() {
        Node node = new Node(null);
        Node leafNode = new Node(node,'a',true);
        node.addNode(leafNode);
        Bohr bohr = new Bohr(node);
        DictionaryCheckerUtil dictionaryCheckerUtil = new DictionaryCheckerUtil(bohr);
        dictionaryCheckerUtil.getWordByLeafNode(leafNode);
        assertTrue("a".equals(dictionaryCheckerUtil.getWordByLeafNode(leafNode)));
      }
}
