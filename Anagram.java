package Assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
	String text1="stops";
	String text2="potss";
	int len1=text1.length();
	int len2=text2.length();
	if(len1==len2) {
		char[] charArray1=text1.toCharArray();
		char[] charArray2=text2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		boolean check;
		check=Arrays.equals(charArray1, charArray2);
		
if(check) {
	System.out.println(text1+" and "+ text2 +" are anagram");
}else {
	System.out.println(" are not anagram");
} 
}
else {
	System.out.println("are not anagram");
}


}

}
