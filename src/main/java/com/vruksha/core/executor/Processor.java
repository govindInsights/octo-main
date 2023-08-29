package com.vruksha.core.executor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vruksha.common.exception.ApplicationException;
import com.vruksha.common.logger.VLogger;
import com.vruksha.core.config.AppConfig;
import com.vruksha.core.model.Voyage;

/**
 * 
 * @author Govindarajan
 *
 */
@Component
public class Processor {

	@Autowired
	AppConfig appConfig;
	
	public void process(Voyage voyage) throws ApplicationException {
		try {
			VLogger.logInfo("Processor started for Voyage " + voyage);
			
			VLogger.logInfo(""+appConfig.getExecutionFlow());
		} catch (Exception e) {
			throw new ApplicationException(e);
		}
	}
}
