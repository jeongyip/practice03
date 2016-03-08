package prob3;

public class Prob3 {
	
	public static void main(String args[]) {
		
		char[] array1 = reverse("Hello World");
		printCharArray(array1);
		
		char[] array2 = reverse("Java Programming!");
		printCharArray(array2);
		
	}
	
	public static char[] reverse(String str){
		
		char[] reverseStr = new char[str.length()];
		
		for(int i=0; i<str.length(); i++){
			reverseStr[str.length()-i-1] = str.charAt(i);
		}
		
		return reverseStr;
	}
	
	public static void printCharArray(char[] array){
		for(int i=0; i<array.length; i++){
			System.out.print(array[i]);
		}
		
		System.out.println();
	}
}
