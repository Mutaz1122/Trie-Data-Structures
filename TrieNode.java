import java.util.HashMap;
import java.util.Map;

public class TrieNode {
	Map<Character, TrieNode>  child;
	boolean isword=false;
	public TrieNode() {
		child=new HashMap<>();
	}
	
}
