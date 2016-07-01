package akhokor;

import  akhokor.

public class DictionaryCheckerUtilTest extends TestCase{
    @Test
    public void testGetWordByLeafNode() {
        main.akhokor.model.Node node = new Node(null);
        Node leafNode = new Node(node,'a',true);
        node.addNode(leafNode);
        Bohr bohr = new Bohr(node);
        DictionaryCheckerUtil dictionaryCheckerUtil = new DictionaryCheckerUtil(bohr);
        dictionaryCheckerUtil.getWordByLeafNode(leafNode);
        assertTrue("a".equals(dictionaryCheckerUtil.getWordByLeafNode(leafNode)));
      }
}
