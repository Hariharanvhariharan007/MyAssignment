package week5;

public class Students {
	public void getStudentlnfo(String id) {
		System.out.println("ID:"+id);
		

	}
	public void getStudentlnfo(int ID,String name) {
		System.out.println("ID:"+ID+"name:"+name);

	}
	
	
	public void getSTudentlnfo(long phoneNumber,String email) {
		System.out.println("phoneNumber:"+phoneNumber+"email:"+email);
	}
	public static void main(String[] args) {
		Students leo=new Students();
		leo.getStudentlnfo("20ghjd38");
		leo.getStudentlnfo(12233, "thala");
		leo.getSTudentlnfo(9887778777L," rx100hhdh@gmail.com");
		
		
		
	}
}