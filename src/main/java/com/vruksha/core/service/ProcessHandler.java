package com.vruksha.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vruksha.common.exception.ApplicationException;
import com.vruksha.common.logger.VLogger;
import com.vruksha.core.executor.Processor;
import com.vruksha.core.executor.Validator;
import com.vruksha.core.model.Response;
import com.vruksha.core.model.Voyage;

@RestController
public class ProcessHandler {
	
	@Autowired
	Validator validator;
	
	@Autowired
	Processor processor;

	@PostMapping(value = "/processVoyage", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<Response> process(@RequestBody Voyage voyage) throws ApplicationException {
		try {
			VLogger.logInfo("Processing Input Voyage " + voyage);
			
			//validate the Voyage 
			validator.validateVoyage(voyage);
			
			//process the Voyage
			processor.process(voyage);
			
		}catch(Exception e) {
			VLogger.logError(e.getMessage());
			throw new ApplicationException(e);
		}
		return ResponseEntity.ok(new Response());
	}
}
