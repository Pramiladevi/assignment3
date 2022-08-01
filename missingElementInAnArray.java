package Assignments;
import java.util.Arrays;

public class missingElementInAnArray {

	public static void main(String[] args) {
		int array[]= { 1,2,3,4,7,6,8};
		Arrays.sort(array);
		for(int i=0;i<array.length;i++) {
			int j=i+1;
		if (array[i]!=j) {
			System.out.println("The Missing Number is "+ j);
			break;
			
		}
		}
	
}
}
