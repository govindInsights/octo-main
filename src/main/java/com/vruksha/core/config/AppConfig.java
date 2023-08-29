package com.vruksha.core.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.vruksha.core.model.ExecutionFlow;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class AppConfig {

	private ExecutionFlow executionFlow;

	public ExecutionFlow getExecutionFlow() {
		return executionFlow;
	}

	public void setExecutionFlow(ExecutionFlow executionFlow) {
		this.executionFlow = executionFlow;
	}
	
	
}
