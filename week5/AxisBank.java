package week5;

public class AxisBank extends Banklnfo {
	public void deposit() {
		System.out.println("50000");

	}
	public static void main(String[] args) {
		AxisBank bank=new AxisBank();
		bank.fixed();
		bank.saving();
		bank.deposit();
	}

}

