package clayfinTrainee;

public class OperatingSystem {
	public static void main(String[] args) {
		NotePad npWin = new Windows();
		npWin.note();
		npWin.edit();
		
		NotePad npMac = new Mac();
		npMac.note();
		npMac.edit();
		
		NotePad npLinux = new Linux();
		npLinux.note();
		npLinux.edit();
		
	}
}


interface NotePad{
	public abstract void note();
	public abstract void edit();
}

class Windows implements NotePad{

	@Override
	public void note() {
		System.out.println("Make note here for windows");
		
	}

	@Override
	public void edit() {
		System.out.println("Edit your note here for windows");
		
	}
	
}

class Mac implements NotePad{

	@Override
	public void note() {
		System.out.println("Make note here for mac");
		
	}

	@Override
	public void edit() {
		System.out.println("Edit your note here for mac");
		
	}
	
}

class Linux implements NotePad{

	@Override
	public void note() {
		System.out.println("Make note here for Linux");
	}

	@Override
	public void edit() {
		System.out.println("Edit your note here for Linux");
		
	}
	
}


