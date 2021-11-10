package io.springcoreassignment2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class QuestionViaListTest {

	@Test
	void Listtest() {
		ApplicationContext context = new ClassPathXmlApplicationContext
				("applicationContext.xml");
		 QuestionViaList qvl=(QuestionViaList) context.getBean("question");
		 
		 assertEquals(qvl.getClass().getSimpleName(), "QuestionViaList" );

		
	}

}
