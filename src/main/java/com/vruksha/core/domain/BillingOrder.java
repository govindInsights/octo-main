package com.vruksha.core.domain;


import java.time.OffsetDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.vruksha.core.model.Exposer;


@Entity
public class BillingOrder extends Exposer{

    @Id
    @Column(nullable = false, updatable = false, length = 256)
    private String orderId;

    @Column(nullable = false, length = 45)
    private String channel;

    @Column(nullable = false, length = 45)
    private String eventCode;

    @Column(columnDefinition = "longtext")
    private String customer;

    @Column
    private OffsetDateTime startTime;

    @Column
    private OffsetDateTime endTime;

    @Column
    private OffsetDateTime insertDate;

    @Column
    private OffsetDateTime updateDate;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private Set<BillingOrderItem> orderBillingOrderItems;

    @OneToMany(mappedBy = "order")
    private Set<BillingItemCharge> orderBillingItemCharges;

    @OneToMany(mappedBy = "order")
    private Set<Invoice> orderInvoices;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(final String orderId) {
        this.orderId = orderId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(final String channel) {
        this.channel = channel;
    }

    public String getEventCode() {
        return eventCode;
    }

    public void setEventCode(final String eventCode) {
        this.eventCode = eventCode;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(final String customer) {
        this.customer = customer;
    }

    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(final OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(final OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public OffsetDateTime getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(final OffsetDateTime insertDate) {
        this.insertDate = insertDate;
    }

    public OffsetDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(final OffsetDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public Set<BillingOrderItem> getOrderBillingOrderItems() {
        return orderBillingOrderItems;
    }

    public void setOrderBillingOrderItems(final Set<BillingOrderItem> orderBillingOrderItems) {
        this.orderBillingOrderItems = orderBillingOrderItems;
    }

    public Set<BillingItemCharge> getOrderBillingItemCharges() {
        return orderBillingItemCharges;
    }

    public void setOrderBillingItemCharges(final Set<BillingItemCharge> orderBillingItemCharges) {
        this.orderBillingItemCharges = orderBillingItemCharges;
    }

    public Set<Invoice> getOrderInvoices() {
        return orderInvoices;
    }

    public void setOrderInvoices(final Set<Invoice> orderInvoices) {
        this.orderInvoices = orderInvoices;
    }

	@Override
	public String toString() {
		return "BillingOrder [orderId=" + orderId + ", channel=" + channel + ", eventCode=" + eventCode + ", customer="
				+ customer + ", startTime=" + startTime + ", endTime=" + endTime + ", insertDate=" + insertDate
				+ ", updateDate=" + updateDate + ", orderBillingOrderItems=" + orderBillingOrderItems
				+ ", orderBillingItemCharges=" + orderBillingItemCharges + ", orderInvoices=" + orderInvoices + "]";
	}

    
    
}
