package hell;
import java.util.Scanner;
public class Practice1 {
	

	//public class NumberToWords {

	    static String[] ones = {
	        "", "one", "two", "three", "four", "five",
	        "six", "seven", "eight", "nine"
	    };

	    static String[] tens = {
	        "", "", "twenty", "thirty", "forty",
	        "fifty", "sixty", "seventy", "eighty", "ninety"
	    };

	    static String[] teens = {
	        "ten", "eleven", "twelve", "thirteen", "fourteen",
	        "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
	    };

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        if (num == 0) {
	            System.out.println("zero");
	            return;
	        }

	        System.out.println(convert(num));
	    }

	    static String convert(int num) {
	        String words = "";

	        if (num >= 100) {
	            words += ones[num / 100] + " hundred ";
	            num = num % 100;
	        }

	        if (num >= 20) {
	            words += tens[num / 10] + " ";
	            num = num % 10;
	        } 
	        else if (num >= 10) {
	            words += teens[num - 10] + " ";
	            return words;
	        }

	        if (num > 0) {
	            words += ones[num];
	        }

	        return words.trim();
	    
	}



}