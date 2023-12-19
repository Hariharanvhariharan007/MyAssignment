package week2.day2;

public class Fibbinocci {
	public static void main(String[] args) {
		 
	int endNum=11;
	int firstNum=0;
	int secondNum=1;
	int sum=0;
	System.out.println(firstNum);
	System.out.println(secondNum);
	for (int i = 1; i <= endNum; i++) {
		sum=firstNum+secondNum;
		firstNum=secondNum;
		secondNum=sum;
		System.out.println(sum);
	}
		
	}
	
			
				
					
			
	}
	


