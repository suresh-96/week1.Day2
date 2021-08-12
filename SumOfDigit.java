package Day2;
public class SumOfDigit 
{
public static void main(String[] args) {
		
	    String str1 =  "Tes12Le79af65";
	    int sum = 0;
	    for (char c : str1.replaceAll("\\D", "").toCharArray()) {
	        int digit = c - '0';
	        sum += digit;
	        if (digit % 2 == 0);
	        }
	    System.out.println(sum);
	    }
}

