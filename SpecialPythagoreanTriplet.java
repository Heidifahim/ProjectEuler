
public class SpecialPythagoreanTriplet {
	//finds the product of abc where a + b + c = n and a^2 + b^2 = c^2
	public int findProductPythagoreanTriplet(int n){
		int a, b, c;
		a = b = c = 0;
		for(int i = (int) Math.sqrt(n); i < n; i ++){
			for(int j = i + 1; j < n; j ++){
				int k = n - j - i;
				if(i*i + j*j == k*k){
					a = i;
					b = j;
					c = k;
				}				
			}
		}
		return a*b*c;
	}
}
