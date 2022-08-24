package clayfinTrainee;

import java.time.LocalTime;

public class Task10 {
	public static void main(String[] args) {
		LocalTime ltime1 = LocalTime.parse("17:52:49");
		LocalTime ltime2 = LocalTime.parse("13:08:00");
		
		int value = ltime1.compareTo(ltime2);
		//long value = ltime1.compareTo(ltime2);
		//float value = ltime1.compareTo(ltime2);
		//double value = ltime1.compareTo(ltime2);
		System.out.println("Int Value:" + value);
		  
        if (value > 0)
            System.out.println("LocalTime1 is started");
        else if (value == 0)
            System.out.println("LocalTime1 is equal to" + " LocalTime2");
        else
            System.out.println("LocalTime2 is stopped");

	}

}
