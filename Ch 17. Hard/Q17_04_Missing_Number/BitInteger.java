package Q17_04_Missing_Number;

public class BitInteger {
	public static int INTEGER_SIZE;
	private boolean[] bits;
	public BitInteger() {
		bits = new boolean[INTEGER_SIZE];
	}
	/* Creates a number equal to given value. Takes time proportional 
	 * to INTEGER_SIZE. */
	public BitInteger(int value){
		bits = new boolean[INTEGER_SIZE];
		for (int j = 0; j < INTEGER_SIZE; j++){
			if (((value >> j) & 1) == 1) bits[INTEGER_SIZE - 1 - j] = true;
			else bits[INTEGER_SIZE - 1 - j] = false;
		}
	}
	
	/** Returns k-th most-significant bit. */ 
	public int fetch(int k){
		if (bits[k]) return 1;
		else return 0;
	}
	
	/** Sets k-th most-significant bit. */
	public void set(int k, int bitValue){
		if (bitValue == 0 ) bits[k] = false;
		else bits[k] = true;
	}
	
	/** Sets k-th most-significant bit. */
	public void set(int k, char bitValue){
		if (bitValue == '0' ) bits[k] = false;
		else bits[k] = true;
	}
	
	/** Sets k-th most-significant bit. */
	public void set(int k, boolean bitValue){
		bits[k] = bitValue;
	}	
	
	public void swapValues(BitInteger number) {
		for (int i = 0; i < INTEGER_SIZE; i++) {
			int temp = number.fetch(i);
			number.set(i, this.fetch(i));
			this.set(i, temp);
		}
	}
		
	public int toInt() {
		int number = 0;
		for (int j = INTEGER_SIZE - 1; j >= 0; j--){
			number = number | fetch(j);
			if (j > 0) {
				number = number << 1;
			}
		}
		return number;
	}
}
/**
 * 1
import java.math.BigInteger;
2
public class BigIntegerFactorial {
3
    public static void main(String[] args) {
        calculateFactorial(50);
    }
    public static void calculateFactorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i=1; i<=n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(n + "! = " + result);
    }
}
The factorial output for an input value of 50 is,
50! = 30414093201713378043612608166064768844377641568960512000000000000
Posted i
 * 
 * **/
