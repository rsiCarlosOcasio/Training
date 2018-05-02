package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
