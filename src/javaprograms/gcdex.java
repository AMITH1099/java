package javaprograms;

public class gcdex {

	public static void main(String[] args) {
		int count=0;
		for(int i=10 ;i<=100;i++) {
			int num = i;
	        int rev=0;
	        int temp=num;
	        // Reversing the number
	        while(num != 0) {
	            int r = num % 10;
	            rev = rev * 10 + r;
	            num = num / 10;
	        }
	        	        // Compare reversed number with original number
	        if(temp == rev) {
	            //System.out.println("The number "+rev+" is a palindrome.");
	            count++;
	        }
}
		System.out.println("Number of palindromes: "+count);
		
	}

}
