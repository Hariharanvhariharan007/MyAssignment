package week1.day;


public class car {
public void applyBreak() {
	System.out.println("Break in applied");

}
private void applygear() {
	System.out.println("gear is applied");

}
public void switchonAC() {
	System.out.println("ac in applied");

}
public void applyAccletre() {
	System.out.println("accletre in applied");

}
public static void main(String[] args) {
	//className objectName = New className();
	car obj=new car();
			//objname,methodname(related)
			obj.applyBreak();
	obj.applygear();
	obj.switchonAC();
	obj.applyAccletre();
}
}
