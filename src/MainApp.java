import akhokor.bohr.Bohr;
import akhokor.model.Node;

/**
 * Created by User on 28.06.16.
 */
public class MainApp {
    public static void main(String[] argv){
        Bohr bohr = new Bohr(new Node(null));
        bohr.addWord("she");
        bohr.addWord("her");
        bohr.addWord("he");
        bohr.addWord("his");
        bohr.addWord("7");
    }
}
