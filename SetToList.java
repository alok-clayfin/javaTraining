package clayfinTrainee;
import java.util.*;
public class SetToList {
		public static void main(String[] args)
		{

			// Creating a hash set of strings
			Set<String> setObj = new HashSet<String>();
			setObj.add("Clayfin..!!");
			setObj.add("Technologies...!!!");

			// Creating an array list using constructor
			List<String> list = new ArrayList<String>(setObj);

			System.out.println("Created ArrayList is");
			for (String x : list)
				System.out.println(x);

			System.out.println("Created LinkedList is");
			List<String> newList = new LinkedList<String>(setObj);
			for (String x : newList)
				System.out.println(x);
		}
	}


