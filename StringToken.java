package clayfinTrainee;

import java.util.*;

public class StringToken {
	public static void main(String args[])
	{
		String a= " : ";
		String b= "Welcome : + : studytonight : . : How : are : You : ?";
		StringTokenizer c = new StringTokenizer(b, a);
		int count1 = c.countTokens();
		for (int i = 0; i<count1; i++)
			System.out.println("token [" + i + "] : "
					+ c.nextToken());
		StringTokenizer d= null;
		while (c.hasMoreTokens())
			System.out.println(d.nextToken());
	}
}
