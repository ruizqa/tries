package tries;
import java.util.*;

public class Trie {
	   public Node root;
	   static Set<Character> chars = new HashSet<Character>();
	   static String tree_word = ""; 
	    public Trie() {
	        this.root = new Node();
	    }
	    
	    public void insertWord(String word) {
	       
	        Node currentNode = this.root;
	        for(int i = 0; i < word.length(); i++) {
	            Character currentLetter = word.charAt(i);
	            Node child = currentNode.children.get(currentLetter);
	            if(child == null) {
	                child = new Node();
	                currentNode.children.put(currentLetter, child); 
	            } 
	            
	            currentNode = child;
	        }
	        currentNode.isCompleteWord = true;
	    }
	    
	    
	    public boolean isPrefixValid(String prefix) {
	    	
	    	Node currentNode = this.root;
	        
	        // iterates over every character in the word
	        for(int i = 0; i < prefix.length(); i++) {
	            // currentLetter is just the character / letter at the iteration
	            Character currentLetter = prefix.charAt(i);
	            // ask if the current letter is in the map of the current node
	            Node child = currentNode.children.get(currentLetter);
	            if(child == null) {
	                return false; 
	            } 
	            
	            currentNode = child;
	        }
	        return true;
	    	
	    	
	    }
	    
	    
	    public boolean isWordValid(String prefix) {
	    	
	    	Node currentNode = this.root;
	        
	        // iterates over every character in the word
	        for(int i = 0; i < prefix.length(); i++) {
	            // currentLetter is just the character / letter at the iteration
	            Character currentLetter = prefix.charAt(i);
	            // ask if the current letter is in the map of the current node
	            Node child = currentNode.children.get(currentLetter);
	            if(child == null) {
	                return false; 
	            } 
	            
	            currentNode = child;
	        }
	        if(currentNode.isCompleteWord) {
	        return true;}
	        else {return false;}
	    	
	    	
	    }
	    
	    public void printAll(Node currentNode) {
	    	if(currentNode.children.keySet()!=null) {
	    		for(Character key:currentNode.children.keySet()) {
	    			System.out.println(key);
	    			Node child = currentNode.children.get(key);
	    			if(child.children.keySet()!=null) {
	    				printAll(child);
	    			}
	    			
	    		}
		    		
	    	}
	    }
	    
	    

	    
	       

	    
	    

	    

	    
	    
}
