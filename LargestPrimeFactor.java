
public class LargestPrimeFactor {
	//finds the largest prime factor of n
	public long findLargestPrimeFactor(long n){
		long start = n;
		int largestPrimeFactor = 1;
		if (n == 2)
			return n;
		else{
			for(int i = 3; i < start; i += 2){
				if(start % i == 0){
					boolean iPrime = true;
					for(int j = 2; j <= i; j ++){
						if(i % j == 0 && j != i){
							iPrime = false;
							break;
						}
					}
					if(iPrime)
						start = start / i; 
				}
				if (i == start- 1 || i == start - 2)
					largestPrimeFactor = (int) start;
			}
		}
		return largestPrimeFactor;
	}
}
