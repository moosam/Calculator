package net.slipp;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculatorTest {
	private static final Logger logger = LoggerFactory
			.getLogger(CalculatorTest.class);
	
	private Calculator calculator;

	@Before
	public void setup() {
		calculator = new Calculator();
	}

	@Test
	public void add() {
		
		logger.debug("add: {}", calculator.add(1, 2));
		
		assertThat(calculator.add(1, 2), is(3));
	}
	
	@Test
	public void multiply() throws Exception {
		assertThat(calculator.multiply(2,3), is(6));
	}

	@Test
	public void subtract() throws Exception {
		Assert.assertEquals(1, calculator.substract(2, 1));
	}

	@After
	public void teardown() {

	}

}
