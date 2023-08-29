package com.vruksha.core.model;

public class Company {

    
	private String fullName;
    private String displayName;
    private String currency;
    private String primaryContactName;
    private String contactEmail;
    private String contactMobile;
    private String address;
    private String billingAddress;
    private String shippingAddress;
    private String notes;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getPrimaryContactName() {
		return primaryContactName;
	}
	public void setPrimaryContactName(String primaryContactName) {
		this.primaryContactName = primaryContactName;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getContactMobile() {
		return contactMobile;
	}
	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	@Override
	public String toString() {
		return "Company [fullName=" + fullName + ", displayName=" + displayName + ", currency=" + currency
				+ ", primaryContactName=" + primaryContactName + ", contactEmail=" + contactEmail + ", contactMobile="
				+ contactMobile + ", address=" + address + ", billingAddress=" + billingAddress + ", shippingAddress="
				+ shippingAddress + ", notes=" + notes + "]";
	}
    // Getters and setters for the fields...
}

