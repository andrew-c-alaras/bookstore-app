package com.acn.bookstore.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.acn.bookstore.constants.BookstoreAppConstants;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ReadingListControllerWebIntegrationTest {

	@Autowired
	private TestRestTemplate rest;

	@Test
	public void testReadingList_ReturnsDefaultReadingList() {
		String actualResponse = rest.getForObject(BookstoreAppConstants.RECOMMENDED, String.class);
		String expectedResponse = "Spring in Action (Manning), Cloud Native Java (O'Reilly), Learning Spring Boot (Packt)";

		assertThat(actualResponse).isEqualTo(expectedResponse);
		assertThat(expectedResponse).isEqualTo(BookstoreAppConstants.DEFAULT_READING_LIST);
	}

}
