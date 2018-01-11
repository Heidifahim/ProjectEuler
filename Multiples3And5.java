public class Multiples3And5{
	//sums all the multiples of 3 and/or 5 below n
	public int SumMultiples3And5(int n){
		int sum = 0;
		int counter = 1;
		while(counter < n){
			if(counter % 5 == 0 && counter % 3 == 0)
				sum += counter;
			else if (counter % 5 == 0 || counter % 3 == 0)
				sum += counter;
			counter++;
		}
		return sum;
	}
}

