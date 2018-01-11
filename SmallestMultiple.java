
public class SmallestMultiple {
	//finds the smallest number that is evenly divisible by all numbers between min and max inclusive
	public int smallestMultiple(int min, int max){
		int result, counter;
		result = 0;
		counter = 2 * max;
		while (true){
			if(counter % max == 0 && counter % (max-1) == 0 && counter % (max-2) == 0 
					&& counter % (max-3) == 0 && counter % (max-4) == 0 && counter % (max-5) == 0
					&& counter % (max-6) == 0 && counter % (max-7) == 0 && counter % (max-8) == 0
					&& counter % (max-9) == 0){
				result = counter;
				break;
			}
			counter++;
				
		}
		return result;
	}
}
