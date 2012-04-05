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
	public void �ĸ��α��е�_���Է�_��() throws Exception {
		assertThat(3, is(text.add("1,2")));
	} 
	
	@Test
	public void �ĸ��α��е�_���Է�_��() throws Exception {
		assertThat(text.add("1,2,3"), is(6));
	}
	
	@Test
	public void �����ڷ�_�ĸ�_���ο���_���() throws Exception {
		assertThat(text.add("1,2\n3"), is(6));
	}
	
	@Test
	public void Ŀ��Ʈ_���̿���_Ŀ����_������_����() throws Exception {
		assertThat(text.add("//;\n1;2;3"), is(6));
	}
	
	//@Test
	//public void �����ϰ��_RuntimeException() throws Exception {
	//	assertThat(text.add("-1,2,3"), is(4));
	//}

}
