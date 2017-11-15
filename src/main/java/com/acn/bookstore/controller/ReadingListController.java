package com.acn.bookstore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acn.bookstore.constants.BookstoreAppConstants;

@RestController
public class ReadingListController {

	@RequestMapping(value = BookstoreAppConstants.RECOMMENDED)
	public String readingList() {
		return BookstoreAppConstants.DEFAULT_READING_LIST;
	}

}
