package week1.day;

public class mobile {
public void sendMessage() {
	System.out.println("voice Message or text Message");

}
public void shareDocument() {
	System.out.println("any details or photo or Business purposes");

}
public void makeCall() {
	System.out.println("viedoCall or normalCall");
	

}
public static void main(String[] args) {
	//className objectName = New className();
	mobile action=new mobile();
	//actionName.MethodName(related)
	action.sendMessage();
	action.shareDocument();
	action.makeCall();
	
}

}

