package clayfinTrainee;

import java.util.Scanner;

public class task13 {
	public static void main(String[] args) {
		String str, word;
	      int wordsLen, i, count=0;
	      Scanner s = new Scanner(System.in);
	      
	      System.out.print("Enter the String: ");
	      str = s.nextLine();
	      System.out.print("\nEnter a Word to Find its Occurrence: ");
	      word = s.next();
	      
	      str = str.toLowerCase();
	      word = word.toLowerCase();
	      
	      String words[] = str.split("\\s+");
	      wordsLen = words.length;
	      
	      for(i=0; i<wordsLen; i++)
	      {
	         if(word.equals(words[i]))
	            count++;
	      }
	      
	      if(count==0)
	         System.out.println("\nThe word \"" +word+ "\" is not found in the String.");
	      else if(count==1)
	         System.out.println("\nThe word \"" +word+ "\" occurs only one time.");
	      else
	         System.out.println("\nThe word \"" +word+ "\" found, " +count+ " times.");
	}

}
