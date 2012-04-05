package net.slipp;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

	private StringCalculator text;
	
	@Before 
	public void setUp() {
		text = new StringCalculator();		
	}

	@Test
	public void textIsEmpty() throws Exception {
		assertThat(0, is(text.add("")));
	}
	
	@Test
	public void testInput() throws Exception {
		assertThat(1, is(text.add("1")));
	}
	
	@Test
	public void 컴마로구분된_두입력_합() throws Exception {
		assertThat(3, is(text.add("1,2")));
	} 
	
	@Test
	public void 컴마로구분된_세입력_합() throws Exception {
		assertThat(text.add("1,2,3"), is(6));
	}
	
	@Test
	public void 구분자로_컴마_새로운줄_사용() throws Exception {
		assertThat(text.add("1,2\n3"), is(6));
	}
	
	@Test
	public void 커멘트_를이용해_커스텀_구분자_지정() throws Exception {
		assertThat(text.add("//;\n1;2;3"), is(6));
	}
	
	//@Test
	//public void 음수일경우_RuntimeException() throws Exception {
	//	assertThat(text.add("-1,2,3"), is(4));
	//}

}
