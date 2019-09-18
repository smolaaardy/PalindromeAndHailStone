// Q1: isPalindrome
// A palindrome is word that reads the same backwards as forward. For example, "level" is a palindrome. Write a method named isPalindrome(Java) which accepts a single word, and returns true if the word is a palindrome, and false if it is not.

// isPalindrome("level")       // true
// isPalindrome("orange")      // false
// isPalindrome("deed")        // true
// isPalindrome("ratemeter")   // false (nearly a palindrome)

public boolean Palindrome(string text) {
	string sentence = text.replaceAll("\\s+", "").toLowerCase();
	int length = sentence.length;
	int forward = 0;
	int backward = length - 1;
	while (backward > forward) {
		char forwardChar = sentence.charAt(forward++);
		char backwardChar = sentence.charAt(backward--);
		if (forwardChar != backwardChar)
			return false;
	}
	return true;
}


// Q2: Hailstone Sequence
// The Hailstone Sequence is defined as follows:

// Start with an integer n.
// If n is even, then the n becomes n / 2
// If n is odd, then n becomes (n * 3) + 1
// Stop when n becomes 1.
// hailstoneSequence(4) → [4, 2, 1]
// hailstoneSequence(3) → [3, 10, 5, 16, 8, 4, 2, 1]
// hailstoneSequence(2) → [2, 1]

public int HailStone(int n) {
	while(n > 1){
		if(n % 2 == 0){
			n /= 2;
			system.out.print(n+"\t"); 
		}
		else {
			n = (n * 3) + 1;
			system.out.print(n + "\t");
		}
	}
}