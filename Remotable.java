package clayfinTrainee;

public class Remotable {
	void swtch() {
		System.out.println("switch On/Off");
	}
	
	void volume() {
		System.out.println("Volume Up/ Volume Down");
	}
	

	public static void main(String[] args) {
		Tv tv = new Tv();
		Dvd dvd =  new Dvd();
		Radio radio =  new Radio();
		
		System.out.println("TV Features");
		tv.swtch();
		tv.volume();
		tv.changeChannel();
		System.out.println();
		
		System.out.println("DVD Features");
		dvd.swtch();
		dvd.volume();
		dvd.insert();
		dvd.eject();
		System.out.println();
		
		System.out.println("Radio Features");
		radio.swtch();
		radio.volume();
		radio.frequency();
		System.out.println();
	}

}

class Tv extends Remotable{
	void changeChannel() {
		System.out.println("Channel changed");
	}
}

class Dvd extends Remotable{
	void insert() {
		System.out.println("Insert CD");
	}
	void eject() {
		System.out.println("Eject CD");
	}
}

class Radio extends Remotable{
	void frequency() {
		System.out.println("Radio Frequency changed");
	}
}
