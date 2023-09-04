package com.vruksha.core.domain;


import java.time.OffsetDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;


@Entity
public class BillingOrderItem {

    @Id
    @Column(nullable = false, updatable = false, length = 256)
    private String orderItemId;

    @Column(nullable = false, length = 45)
    private String eventCode;

    @Column(nullable = false, length = 45)
    private String vesselType;

    @Column(nullable = false, length = 45)
    private String chargeType;

    @Column(length = 45)
    private String portCode;

    @Column
    private OffsetDateTime startTime;

    @Column
    private OffsetDateTime endTime;

    @Column(length = 45)
    private String masterReferenceId;

    @Column
    private OffsetDateTime insertDate;

    @Column
    private OffsetDateTime updateDate;

    @Column(length = 45)
    private String userId;

    @Column(columnDefinition = "longtext")
    private String itemDetails;

    @ManyToOne(fetch = FetchType.LAZY)
    @NotFound(
    	    action = NotFoundAction.IGNORE)
    @JoinColumn(name = "order_id", insertable = false,
    	    updatable = false, referencedColumnName = "orderId",nullable = true)
    private BillingOrder order;

    @OneToMany(mappedBy = "orderItem")
    private Set<BillingItemCharge> orderItemBillingItemCharges;

    @OneToMany(mappedBy = "orderItem")
    private Set<Invoice> orderItemInvoices;
    
    

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(final String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getEventCode() {
        return eventCode;
    }

    public void setEventCode(final String eventCode) {
        this.eventCode = eventCode;
    }

    public String getVesselType() {
        return vesselType;
    }

    public void setVesselType(final String vesselType) {
        this.vesselType = vesselType;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(final String chargeType) {
        this.chargeType = chargeType;
    }

    public String getPortCode() {
        return portCode;
    }

    public void setPortCode(final String portCode) {
        this.portCode = portCode;
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

    public String getMasterReferenceId() {
        return masterReferenceId;
    }

    public void setMasterReferenceId(final String masterReferenceId) {
        this.masterReferenceId = masterReferenceId;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(final String userId) {
        this.userId = userId;
    }

    public String getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(final String itemDetails) {
        this.itemDetails = itemDetails;
    }

    public BillingOrder getOrder() {
        return order;
    }

    public void setOrder(final BillingOrder order) {
        this.order = order;
    }

    public Set<BillingItemCharge> getOrderItemBillingItemCharges() {
        return orderItemBillingItemCharges;
    }

    public void setOrderItemBillingItemCharges(
            final Set<BillingItemCharge> orderItemBillingItemCharges) {
        this.orderItemBillingItemCharges = orderItemBillingItemCharges;
    }

    public Set<Invoice> getOrderItemInvoices() {
        return orderItemInvoices;
    }

    public void setOrderItemInvoices(final Set<Invoice> orderItemInvoices) {
        this.orderItemInvoices = orderItemInvoices;
    }

}
