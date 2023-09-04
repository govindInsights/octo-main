package com.vruksha.core.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "voyage")
public class Voyage {

    private String channel;
    private String eventCode;
    private Customer customer;
    
    private ArrayList<BillingItem> billingItems;

    public String getChannel() {
        return channel;
    }

    @XmlElement
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getEventCode() {
        return eventCode;
    }

    @XmlElement
    public void setEventCode(String eventCode) {
        this.eventCode = eventCode;
    }

    public Customer getCustomer() {
        return customer;
    }

    @XmlElement
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<BillingItem> getBillingItems() {
        return billingItems;
    }

    @XmlElementWrapper
    @XmlElement(name = "billingItem")
    public void setBillingItems(ArrayList<BillingItem> billingItems) {
        this.billingItems = billingItems;
    }

    @Override
    public String toString() {
        return "Voyage{" +
                "channel='" + channel + '\'' +
                ", eventCode='" + eventCode + '\'' +
                ", customer=" + customer +
                ", billingItem=" + billingItems +
                '}';
    }
}
