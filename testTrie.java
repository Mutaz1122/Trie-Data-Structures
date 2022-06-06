import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class testTrie {

	public static void main(String[] args) throws FileNotFoundException {
//		String st="STOP";
//		Trie c=new Trie();
//		c.letters(st);
//		System.out.println(c.allWordsPrefix("PO"));
//		

		


		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		Trie c1=new Trie();;

		int chocie=0;
		String s;
	while(chocie!=7) {
		System.out.println("******************************************************");

		System.out.println("TRIE PROJECT: Enter your choice?");
		System.out.println("1) Create an empty trie");
		System.out.println("2) Create a trie with initial letters");
		System.out.println("3) Insert a word");
		System.out.println("4) Delete a word");
		System.out.println("5) List all words that begin with a prefix");
		System.out.println("6) Size of the trie");
		System.out.println("7) End");
		chocie=sc1.nextInt();
		if(chocie==1) c1=new Trie();
		else if(chocie==2) {
			System.out.println("Enter initial letters: ");
			s=sc2.nextLine();
			s=s.replaceAll("\\s+", "");
			s=s.toUpperCase();
			c1.letters(s);
			
		}
		else if(chocie==3) {
			System.out.println("Enter a word to insert ");
			s=sc2.nextLine();
			s=s.toUpperCase();
			c1.insert(s);
		}
		else if(chocie==4) {
			System.out.println("Enter a word to delete ");
			s=sc2.nextLine();
			s=s.toUpperCase();
			c1.delete(s);
		}
		else if(chocie==5) {
			System.out.println("Enter the prefix ");
			s=sc2.nextLine();
			s=s.toUpperCase();
			System.out.println(c1.allWordsPrefix(s));
		}
		
		else if(chocie==6) {
			System.out.println("size of the trie is: "+ c1.size());

		}
		else  {
			chocie=7;
		}
		
			
	}
	
	}
	
}
