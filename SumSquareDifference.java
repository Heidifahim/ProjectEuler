
public class SumSquareDifference {
	public int sumSquareDifference(int n){
		int sum, sumOfSquares;
		sum = sumOfSquares = 0;
		for(int i = 1; i <= n; i ++){
			sum += i;
			sumOfSquares += i*i;
		}
		int squareOfSum = sum * sum;
		return squareOfSum - sumOfSquares;
	}
}
