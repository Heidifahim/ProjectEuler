
public class NthPrime {
	public int findNthPrime(int n){
		int count = 1;
		int i = 2;
		while(count < n){
			i++;
			boolean isPrime = true;
			for(int j = 2; j <= (int) Math.sqrt(i); j++){
				if(i % j == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime) count++;	
		}
		return i;
	}
}
