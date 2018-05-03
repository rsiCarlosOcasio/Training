package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import anonymousAndLambdaExpressions.Adulthood;

class AdultAgeTest {

	@Test
	void test() {
		Adulthood adulthood = new Adulthood();
		
		int adultDogAge = adulthood.getDogAge();
		int adultHumanAge = adulthood.getHumanAge();
		
		Assert.assertTrue(adultDogAge == 5);
		Assert.assertTrue(adultHumanAge == 21);
	}

}
