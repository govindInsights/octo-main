package com.vruksha.core.executor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vruksha.common.exception.ApplicationException;
import com.vruksha.common.logger.VLogger;
import com.vruksha.core.config.AppConfig;
import com.vruksha.core.domain.BillingOrder;
import com.vruksha.core.model.Voyage;
import com.vruksha.core.repos.BillingOrderRepository;
import com.vruksha.core.util.Util;

/**
 * 
 * @author Govindarajan
 *
 */
@Component
public class Processor {

	@Autowired
	AppConfig appConfig;
	
	@Autowired
	BillingOrderRepository billingOrderRepository;
	
	public void process(Voyage voyage) throws ApplicationException {
		try {
			VLogger.logInfo("Processor started for Voyage " + voyage);
			
			BillingOrder order = billingOrderRepository.saveAndFlush(Util.convertVoyage(voyage));
			//billingOrderRepository.saveAndFlush(Util.convertVoyage(voyage, order));
			VLogger.logInfo(order.toString() + "" );
			
			VLogger.logInfo(""+appConfig.getExecutionFlow());
		} catch (Exception e) {
			throw new ApplicationException(e);
		}
	}
}
