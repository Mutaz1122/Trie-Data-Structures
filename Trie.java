import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Trie {
	private TrieNode root;
	
public Trie() {
	root=new TrieNode();
}

public boolean isEmpty() {
	
	if(root.child.isEmpty()) return true;
	return false;			
}

public void clear() {
	root.child.clear();
}

public void insert(String s) {
	if(this.contains(s));
	else {
	TrieNode temp=root;
	for(int i=0; i<s.length(); i++){
		char c=s.charAt(i);
	if(!temp.child.containsKey(c)) {
		temp.child.put(c,new TrieNode());

		temp=temp.child.get(c);
		}
	else temp=temp.child.get(c);
}
temp.isword=true;	
}}

public boolean contains(String s) {
	TrieNode temp=root;
	for(int i=0; i<s.length(); i++){
		char c=s.charAt(i);
	if(!temp.child.containsKey(c)) {
		return false;}

		else temp=temp.child.get(c);	
}
if(temp.isword)
return true;	
return false;	
}

public boolean isPrefix(String p) {
	
	TrieNode temp=root;
	for(int i=0; i<p.length(); i++){
		char c=p.charAt(i);
	if(!temp.child.containsKey(c)) {
		return false;}

		else temp=temp.child.get(c);	
}

return true;	
	
}

public int size() {
	return size1(root)-1;
	
	
	
}


private int size1(TrieNode t) {
	int result=0;
if (t.child.isEmpty())
	return 1;

	result++;
	for (TrieNode key : t.child.values()) {
		result+=size1(key);
	}
	return result;
}

public ArrayList<String> allWordsPrefix(String p) {
	ArrayList<String> s=new ArrayList<String>();
	char c='a';
	TrieNode temp=root;
	for(int i=0; i<p.length(); i++){
		 c=p.charAt(i);
	if(temp.child.containsKey(c)) {
		temp=temp.child.get(c);
		}

		else return s;	
}
	allWordsPrefix1(temp, p, s,"");
	return s;	
}

private void allWordsPrefix1(TrieNode t,String p,ArrayList<String> s,String s1) {
	String s2=s1;
	if (t.child.isEmpty()&&t.isword&&!s.contains(p+s2)) {
		s.add(p+s2);
		s2="";

	}
	
	else {

		for (Character key : t.child.keySet()) {
			if (t.isword&&!s.contains(p+s2)) {
				s.add(p+s2);

			}
			allWordsPrefix1(t.child.get(key) , p, s,s2+key);

		}

	}

	
}

public void delete(String s) {
	
	if(this.contains(s)) {
	
	TrieNode temp=root;
	for(int i=0; i<s.length(); i++){
		char c=s.charAt(i);
	if(!temp.child.containsKey(c)) {

		temp=temp.child.get(c);
		}
	else temp=temp.child.get(c);
}
temp.isword=false;	

	
}}

//public void insertL(String s) {
//	TrieNode temp=root;
//	for(int i=0; i<s.length(); i++){
//		char c=s.charAt(i);
//	if(!temp.child.containsKey(c)) {
//		temp.child.put(c,new TrieNode());
//
//		temp=temp.child.get(c);
//		}
//	else temp=temp.child.get(c);
//}
//}


public void letters(String p) throws FileNotFoundException {
	ArrayList<String> s=new ArrayList<String>();


	Trie c=new Trie();
	File file = new File("dictionary.txt");
	Scanner sc = new Scanner(file);
	while(sc.hasNext()) {
		String st1=sc.nextLine();
		if(p.contains(st1.charAt(0)+"")&& st1.length()<=p.length())
			s.add(st1);
		

	}
	for(int y=0;y<s.size()-1;y++)
	{
		String stt="";
		for(int i=0;i<s.get(y).length();i++) {
			if(p.contains(s.get(y).charAt(i)+"")&&!stt.contains(s.get(y).charAt(i)+"")) {
				stt=stt+s.get(y).charAt(i);

			
			}
			else break;
		}
		if(stt.length()==s.get(y).length())
			insert(stt);
	}
	

}


}
