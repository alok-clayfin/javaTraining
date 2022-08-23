package clayfinTrainee;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner("hey, -How -are you!");
		//scn.useDelimiter("-");
		//scn.useDelimiter(",");
		scn.useDelimiter("-");
		while(scn.hasNext()) {
			System.out.println(scn.next());
		}
	}

}
