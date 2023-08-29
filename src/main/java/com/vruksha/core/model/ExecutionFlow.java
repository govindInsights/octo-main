package com.vruksha.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ExecutionFlow {
    @JsonProperty("flow")
    private List<Flow> flow;

    public List<Flow> getFlow() {
        return flow;
    }

    public void setFlow(List<Flow> flow) {
        this.flow = flow;
    }

    public static class Flow {
        @JsonProperty("flowCode")
        private String flowCode;

        @JsonProperty("flowStep")
        private List<FlowStep> flowStep;

        public String getFlowCode() {
            return flowCode;
        }

        public void setFlowCode(String flowCode) {
            this.flowCode = flowCode;
        }

        public List<FlowStep> getFlowStep() {
            return flowStep;
        }

        public void setFlowStep(List<FlowStep> flowStep) {
            this.flowStep = flowStep;
        }

		@Override
		public String toString() {
			return "Flow [flowCode=" + flowCode + ", flowStep=" + flowStep + "]";
		}
        
        
    }
    public static class FlowStep {
    	@JsonProperty("sequence")
    	private String sequence;
    	
    	@JsonProperty("implementationClass")
    	private String implementationClass;

		public String getSequence() {
			return sequence;
		}

		public void setSequence(String sequence) {
			this.sequence = sequence;
		}

		public String getImplementationClass() {
			return implementationClass;
		}

		public void setImplementationClass(String implementationClass) {
			this.implementationClass = implementationClass;
		}

		@Override
		public String toString() {
			return "FlowStep [sequence=" + sequence + ", implementationClass=" + implementationClass + "]";
		}
    	
    	
    }
	@Override
	public String toString() {
		return "ExecutionFlow [flow=" + flow + "]";
	}
    
    
}

/*
 * public static class FlowStep {
 * 
 * @JsonProperty("sequence")
 */
       
