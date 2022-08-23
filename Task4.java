package clayfinTrainee;

import java.io.*;
import java.util.*;
// Reset function of Scanner
public class Task4 {
	public static void main(String[] args) { 
		    try {
		          String str = "ClayfinTechnologies";
		          Reader reader = new StringReader(str);
		          int chr;
		          for (int i = 0; i < 10; i++) {
		                chr = reader.read();
		                System.out.print((char)chr);
		            }
		  
		            System.out.println();
		            reader.reset();
		            for (int i = 0; i < 5; i++) {
		                chr = reader.read();
		                System.out.print((char)chr);
		            }
		        }
		        catch (Exception e) {
		            System.out.println(e);
		        }
		  
	}

}
