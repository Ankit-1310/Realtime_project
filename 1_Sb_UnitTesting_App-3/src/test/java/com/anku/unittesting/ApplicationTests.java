package com.anku.unittesting;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

class ApplicationTests {
	
	Calculator c=new Calculator();

	@Test
	void contextLoads() {
	}
	@Test
	void testSum() {
		int expacted =18;
		int actual =c.doSum(12,3, 3);
		assertThat(actual).isEqualTo(expacted);
	}
	
	@Test
	void testMul() {
		int expected =12;
		int actual = c.doMul(2, 2,3);
		assertThat(actual).isEqualTo(expected);
	}

}
