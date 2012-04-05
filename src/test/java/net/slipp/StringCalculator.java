package net.slipp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class StringCalculator {

	public int add(String text) throws Exception{
		// TODO Auto-generated method stub

		if (text.isEmpty()) {
			return 0;
		}
		
		if (text.startsWith("//")) {
				Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
				m.find();
				String custtomDelimeter = m.group(1);
				String[] tokens = m.group(2).split(custtomDelimeter);
				
				int sum = 0;
				for (int i = 0; i < tokens.length; i++) {
						sum = sum + Integer.parseInt(tokens[i]);
				}
				return sum;
		}

		String[] numbers = text.split(",|\n");

		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			if(0 > Integer.parseInt(numbers[i])){
				
				Exception ex = new Exception("À½¼ö");
				throw ex;

			}
			sum = sum + Integer.parseInt(numbers[i]);
		}

		return sum;

	}
}
