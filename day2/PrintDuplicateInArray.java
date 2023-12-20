package week2.day2;

public class PrintDuplicateInArray {
	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int size=arr.length;
		int firstnum=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				firstnum=0;
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				
			}
			
		}
	 
		
		
	}

	}
}
