package com.vruksha.core.model;

public class BillingItem {

    private String chargeType;
    private String vesselType;
    private String portCode;
    private String requestType;
    private String startDateTime;
    private String endDateTime;
    private String vesselReferenceId;
	public String getChargeType() {
		return chargeType;
	}
	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}
	public String getVesselType() {
		return vesselType;
	}
	public void setVesselType(String vesselType) {
		this.vesselType = vesselType;
	}
	public String getPortCode() {
		return portCode;
	}
	public void setPortCode(String portCode) {
		this.portCode = portCode;
	}
	@Override
	public String toString() {
		return "BillingItem [chargeType=" + chargeType + ", vesselType=" + vesselType + ", portCode=" + portCode
				+ ", requestType=" + requestType + ", startDateTime=" + startDateTime + ", endDateTime=" + endDateTime
				+ ", vesselReferenceId=" + vesselReferenceId + "]";
	}
	public String getRequestType() {
		return requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	public String getStartDateTime() {
		return startDateTime;
	}
	public void setStartDateTime(String startDateTime) {
		this.startDateTime = startDateTime;
	}
	public String getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(String endDateTime) {
		this.endDateTime = endDateTime;
	}
	public String getVesselReferenceId() {
		return vesselReferenceId;
	}
	public void setVesselReferenceId(String vesselReferenceId) {
		this.vesselReferenceId = vesselReferenceId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chargeType == null) ? 0 : chargeType.hashCode());
		result = prime * result + ((endDateTime == null) ? 0 : endDateTime.hashCode());
		result = prime * result + ((portCode == null) ? 0 : portCode.hashCode());
		result = prime * result + ((requestType == null) ? 0 : requestType.hashCode());
		result = prime * result + ((startDateTime == null) ? 0 : startDateTime.hashCode());
		result = prime * result + ((vesselReferenceId == null) ? 0 : vesselReferenceId.hashCode());
		result = prime * result + ((vesselType == null) ? 0 : vesselType.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BillingItem other = (BillingItem) obj;
		if (chargeType == null) {
			if (other.chargeType != null)
				return false;
		} else if (!chargeType.equals(other.chargeType))
			return false;
		if (endDateTime == null) {
			if (other.endDateTime != null)
				return false;
		} else if (!endDateTime.equals(other.endDateTime))
			return false;
		if (portCode == null) {
			if (other.portCode != null)
				return false;
		} else if (!portCode.equals(other.portCode))
			return false;
		if (requestType == null) {
			if (other.requestType != null)
				return false;
		} else if (!requestType.equals(other.requestType))
			return false;
		if (startDateTime == null) {
			if (other.startDateTime != null)
				return false;
		} else if (!startDateTime.equals(other.startDateTime))
			return false;
		if (vesselReferenceId == null) {
			if (other.vesselReferenceId != null)
				return false;
		} else if (!vesselReferenceId.equals(other.vesselReferenceId))
			return false;
		if (vesselType == null) {
			if (other.vesselType != null)
				return false;
		} else if (!vesselType.equals(other.vesselType))
			return false;
		return true;
	}

    
    
    // Getters and setters for the fields...
}
