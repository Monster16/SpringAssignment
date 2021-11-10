package io.springcoreassignment2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class QuestionViaSetTest {

	@Test
	void Settest() {
		ApplicationContext context = new ClassPathXmlApplicationContext
				("applicationContext.xml");
		QuestionViaSet qvl=(QuestionViaSet) context.getBean("question1");
		 
		 assertEquals(qvl.getClass().getSimpleName(), "QuestionViaSet" );

		
	}

}
