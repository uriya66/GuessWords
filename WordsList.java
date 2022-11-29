import java.util.*;

public class WordsList {

	// instance variables
	private ArrayList<String> Words = new ArrayList<String>();
	private int WordsLength;
	
	//Constructor for objects of class Word.
	public WordsList() {
		String[] Arr = {"Bread", "Pastry", "Cakes", "Meat", "Cheese", "beans", "Fruit", "Vegetables", "Sauces", "macaroni", "spaghetti", "pasta", "popcorn", "milk", "pies", "cream", "chocolate", "coffee", "beer", "wine"};	
		for (int i=0;i<Arr.length;i++) { 
			Words.add(Arr[i]);
		}
		WordsLength = Arr.length;
	}
	
     //Constructor for objects of class Word.
	public WordsList(String[] Arr) {
		for (int i=0;i<Arr.length;i++) { Words.add(Arr[i]);}
		WordsLength = Arr.length;
	}
	
	//Get a random word from word list
	public String getWrod() {
		Random rand = new Random();
		int i = rand.nextInt(WordsLength);
		return Words.get(i);			
	}
}

