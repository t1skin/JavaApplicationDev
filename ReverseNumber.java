package Sample;

public class ReverseNumber {
	public int reverseNumber(int number) {
		String str_number = Integer.toString(number);
		String rev_number = "";
		
		for(char digit: str_number.toCharArray()) {
			rev_number = digit + rev_number;
		}
		
		return Integer.parseInt(rev_number);
	}
}
