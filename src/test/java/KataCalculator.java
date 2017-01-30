import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;


public class KataCalculator {

	@Test
	public void emptyStringShouldReturn0(){
		Calculator calculator = new Calculator();
		int result = calculator.Add("");
		Assert.assertEquals(0, result);
	}
	
	@Test
	public void oneStringShouldReturn1(){
		Calculator calculator = new Calculator();
		int result = calculator.Add("1");
		Assert.assertEquals(1, result);
	}
	
	@Test
	public void sumShouldReturnSumValue(){
		Calculator calculator = new Calculator();
		int sampleResult = 5;
		int result = calculator.Add("2,3");
		Assert.assertEquals(sampleResult, result);
	}
	
}
