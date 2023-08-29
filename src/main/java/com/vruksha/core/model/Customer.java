package com.vruksha.core.model;

import javax.xml.bind.annotation.XmlElement;

public class Customer {

    private Company company;

    public Company getCompany() {
        return company;
    }

    @XmlElement
    public void setCompany(Company company) {
        this.company = company;
    }

	@Override
	public String toString() {
		return "Customer [company=" + company + "]";
	}
    
}
