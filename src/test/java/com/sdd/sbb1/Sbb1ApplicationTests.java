package com.sdd.sbb1;

import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
class Sbb1ApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

	@Test
	void testJpa() {
		Question q = this.questionRepository.findBySubjectAndContent(
				"sbb가 무엇인가요?", "sbb에 대해서 알고 싶습니다.");
		assertEquals(1, q.getId());
	}
}