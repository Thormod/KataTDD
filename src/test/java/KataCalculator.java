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
	
}
