package junittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class deleteATest {

	@Test
	void test() {
	JunitTest test=new JunitTest();
	String str=test.deleteA("bcdaA");
	String str1=test.deleteA("abcd");
	String str2=test.deleteA("aAbcd");
	assertEquals("bcdaA",str);
	assertEquals("bcd",str1);
assertEquals("bcd",str2);
	}

}
