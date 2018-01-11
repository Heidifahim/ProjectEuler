
public class LargestPalindromeProduct {
	//finds largest palindrome made from the product of two n-digit numbers
	public String LargestPalindromeProd(int n){
	String min = "1";
	while(min.length() < n )
		min += "0";
	String max = "";
	while(max.length() < n)
		max += "9";
	String result = "";
	int int1, int2;
	int1=int2=0;
	for(int1 = Integer.parseInt(max); int1 > Integer.parseInt(min); int1--){
		for(int2 = Integer.parseInt(max); int2 > Integer.parseInt(min); int2 --){
			String product = String.valueOf(int1 * int2);
			String reversedProduct = new StringBuilder(product).reverse().toString();
			if(product.equals(reversedProduct)){
				result =  product;
				break;
			}			
		}
		if(!result.isEmpty())
			break;
	}
	return "Largest palindrome product of two "+n+"-digit numbers is "+result+ " = "+ int1+" x "+int2;
	}
}
