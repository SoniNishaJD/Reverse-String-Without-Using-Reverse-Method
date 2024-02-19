//Write a Java code  Reverse a String without using String's reverse method 
public class ReverseString {
	
	
	 public static String reverse(String str) {
 char[] charArray = str.toCharArray();
  int l = 0;
  int r = charArray.length - 1;
  
  while(l < r) {
	  char temp = charArray[l];
	  charArray[l] = charArray[r];
	  charArray[r] = temp;
	  l++;
	  r--;
  }
	  return new String(charArray);
  
}
	public static void main(String[] args) {
		
		String original = "Nisha, Soni!";
        String reversed = reverse(original);

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
	}

}
