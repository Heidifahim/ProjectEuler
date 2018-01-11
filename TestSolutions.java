
public class TestSolutions {
	public static void main(String [] args){
		Multiples3And5 Problem1 = new Multiples3And5();
		System.out.println("Sum of multiples of 3 or 5 below 1000: " +Problem1.SumMultiples3And5(1000));
		
		EvenFibonacciNumbers Problem2 = new EvenFibonacciNumbers();
		System.out.println("Sum of even Fibonacci numbers not exceeding 4 million: "+Problem2.SumEvenFibs(4000000));
		
		LargestPrimeFactor Problem3 = new LargestPrimeFactor();
		System.out.println("Largest prime factor of 300851475143: "+Problem3.findLargestPrimeFactor((long)300851475143.0));
		
		LargestPalindromeProduct Problem4 = new LargestPalindromeProduct();
		System.out.println(Problem4.LargestPalindromeProd(3));
		
		SmallestMultiple Problem5 = new SmallestMultiple();
		System.out.println("Smallest positive number evenly divisible by numbers 1 - 20: "+Problem5.smallestMultiple(1, 20));
	
		SumSquareDifference Problem6 = new SumSquareDifference();
		System.out.println("Difference between the sum of the squares of the first 100 natural numbers "
				+ "and the square of the sum is: " + Problem6.sumSquareDifference(100));
		
		NthPrime Problem7 = new NthPrime();
		System.out.println("The 10001st prime is: "+Problem7.findNthPrime(10001));
		
		SpecialPythagoreanTriplet Problem9 = new SpecialPythagoreanTriplet();
		System.out.println(Problem9.findProductPythagoreanTriplet(1000));
	}
}
