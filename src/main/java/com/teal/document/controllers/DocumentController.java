package com.teal.document.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


//@RestController
public class DocumentController {
	
	@Autowired
	//DocumentRepository documentRepository; 

	private static final Logger LOGGER = LoggerFactory.getLogger(DocumentController.class);
	/*
	@RequestMapping(value = "/documents/", method = RequestMethod.GET)
	public List<Document> getDocuments() {
		return documentRepository.findAll();
	}
	
	@RequestMapping(value = "/documents/{id}", method = RequestMethod.GET)
	public Document getDocument(@PathVariable("id") int id) {
		LOGGER.info("Finding document by ID:"+id);
		return documentRepository.findById(id).get();
	}

	@RequestMapping(value = "/documents/", method = RequestMethod.POST)
	public Document createDocument(@RequestBody Document document) {
		return documentRepository.save(document);
	}

	@RequestMapping(value = "/documents/", method = RequestMethod.PUT)
	public Document updateDocument(@RequestBody Document document) {
		return documentRepository.save(document);
	}

	@RequestMapping(value = "/documents/{id}", method = RequestMethod.DELETE)
	public void deleteDocument(@PathVariable("id") int id) {
		documentRepository.deleteById(id);
	}
*/
}



