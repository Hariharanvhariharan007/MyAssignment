package week5;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("1920*1080");

	}
	public static void main(String[] args) {
		Desktop myDesktop=new Desktop();
		myDesktop.computerModel();
		myDesktop.desktopSize();
	}

}
