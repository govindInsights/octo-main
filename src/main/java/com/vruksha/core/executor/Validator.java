package com.vruksha.core.executor;

import org.springframework.stereotype.Component;

import com.vruksha.common.exception.ApplicationException;
import com.vruksha.common.logger.VLogger;
import com.vruksha.core.model.Voyage;

@Component
public class Validator {

	
	public boolean validateVoyage(Voyage voyage) throws ApplicationException {
		try {
			VLogger.logInfo("Validation started for Voyage " + voyage);
		}catch(Exception e) {
			throw new ApplicationException(e.getMessage());
		}
		return true;
	}
}
