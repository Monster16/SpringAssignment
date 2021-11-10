package io.springcoreassignment2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class QuestionViaMapTest {

	@Test
	void Maptest() {
		ApplicationContext context = new ClassPathXmlApplicationContext
				("applicationContext.xml");
		QuestionViaMap qvl2=(QuestionViaMap) context.getBean("question2");
		 
		 assertEquals(qvl2.getClass().getSimpleName(), "QuestionViaMap" );

		
	}
}
