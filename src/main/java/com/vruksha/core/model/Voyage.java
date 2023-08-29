package com.vruksha.core.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.boot.jackson.JsonComponent;

@XmlRootElement(name = "voyage")
public class Voyage {

    private String channel;
    private String eventCode;
    private Customer customer;
    private BillingItem billingItem;

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

    public BillingItem getBillingItem() {
        return billingItem;
    }

    @XmlElement(name = "billingItem")
    public void setBillingItem(BillingItem billingItem) {
        this.billingItem = billingItem;
    }

    @Override
    public String toString() {
        return "Voyage{" +
                "channel='" + channel + '\'' +
                ", eventCode='" + eventCode + '\'' +
                ", customer=" + customer +
                ", billingItem=" + billingItem +
                '}';
    }
}
