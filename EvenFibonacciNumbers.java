import java.util.*;
public class EvenFibonacciNumbers {
	//sums all even fibonacci numbers that do not exceed n
	public int SumEvenFibs(int n){
		ArrayList<Integer> fibNumbersArray = new ArrayList<Integer>();
		int sum, counter, fibNumber;
		sum = counter = fibNumber = 0;
		while(fibNumber < n){
			if(counter == 0 || counter == 1)
				fibNumbersArray.add(counter, 1);
			else{
				fibNumber = fibNumbersArray.get(counter-2) + fibNumbersArray.get(counter-1);
				fibNumbersArray.add(counter, fibNumber);
				if(fibNumber % 2 == 0)
					sum += fibNumber;
			}
			counter ++;
		}
		return sum;
	}
}
