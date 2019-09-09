import java.math.BigInteger;

public class BigIntegers {

	public static void main(String[] args) {
		// if range exceeds long, use big integers to represent very large numbers
		BigInteger fac = new BigInteger("1");
		for(int i=2;i<=n;++i){
			fac= fac.multiply(BigInteger.valueOf(i)); // => converting a very large number to number using BigInteger.valueOf(i)
		}

	}

}
