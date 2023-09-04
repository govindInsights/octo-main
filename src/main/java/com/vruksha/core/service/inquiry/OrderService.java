package com.vruksha.core.service.inquiry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vruksha.common.exception.ApplicationException;
import com.vruksha.common.logger.VLogger;
import com.vruksha.core.model.Response;
import com.vruksha.core.repos.BillingOrderRepository;

@RestController
public class OrderService {
	
	@Autowired
	BillingOrderRepository billingOrderRepository;

	@GetMapping(value = "/getAllOrders")
	public ResponseEntity<Response> process() throws ApplicationException {
		Response response = new Response();
		try {
			VLogger.logInfo("Processing getAllOrders ");
			
			response.setExposer(billingOrderRepository.findAll());
			billingOrderRepository.findAll().stream().forEach(s->VLogger.logInfo("--> " +s.toString()));
			
		}catch(Exception e) {
			VLogger.logError(e.getMessage());
			throw new ApplicationException(e);
		}
		return ResponseEntity.ok(response);
	}
}
