package com.vruksha.core.domain;


import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class BillingItemCharge {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer itemChargeId;

    @Column(length = 45)
    private String chargeCode;

    @Column(length = 45)
    private String chargeDescription;

    @Column
    private OffsetDateTime chargeStartDate;

    @Column
    private OffsetDateTime chargeEndDate;

    @Column(length = 45)
    private String influenceType;

    @Column
    private Double chargeAmount;

    @Column
    private Double calculatedAmount;

    @Column
    private Double vatAmount;

    @Column(length = 20)
    private String vatPercentage;

    @Column(columnDefinition = "longtext")
    private String chargeDetails;

    @Column
    private OffsetDateTime insertDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    private BillingOrder order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_item_id")
    private BillingOrderItem orderItem;

    public Integer getItemChargeId() {
        return itemChargeId;
    }

    public void setItemChargeId(final Integer itemChargeId) {
        this.itemChargeId = itemChargeId;
    }

    public String getChargeCode() {
        return chargeCode;
    }

    public void setChargeCode(final String chargeCode) {
        this.chargeCode = chargeCode;
    }

    public String getChargeDescription() {
        return chargeDescription;
    }

    public void setChargeDescription(final String chargeDescription) {
        this.chargeDescription = chargeDescription;
    }

    public OffsetDateTime getChargeStartDate() {
        return chargeStartDate;
    }

    public void setChargeStartDate(final OffsetDateTime chargeStartDate) {
        this.chargeStartDate = chargeStartDate;
    }

    public OffsetDateTime getChargeEndDate() {
        return chargeEndDate;
    }

    public void setChargeEndDate(final OffsetDateTime chargeEndDate) {
        this.chargeEndDate = chargeEndDate;
    }

    public String getInfluenceType() {
        return influenceType;
    }

    public void setInfluenceType(final String influenceType) {
        this.influenceType = influenceType;
    }

    public Double getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(final Double chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public Double getCalculatedAmount() {
        return calculatedAmount;
    }

    public void setCalculatedAmount(final Double calculatedAmount) {
        this.calculatedAmount = calculatedAmount;
    }

    public Double getVatAmount() {
        return vatAmount;
    }

    public void setVatAmount(final Double vatAmount) {
        this.vatAmount = vatAmount;
    }

    public String getVatPercentage() {
        return vatPercentage;
    }

    public void setVatPercentage(final String vatPercentage) {
        this.vatPercentage = vatPercentage;
    }

    public String getChargeDetails() {
        return chargeDetails;
    }

    public void setChargeDetails(final String chargeDetails) {
        this.chargeDetails = chargeDetails;
    }

    public OffsetDateTime getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(final OffsetDateTime insertDate) {
        this.insertDate = insertDate;
    }

    public BillingOrder getOrder() {
        return order;
    }

    public void setOrder(final BillingOrder order) {
        this.order = order;
    }

    public BillingOrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(final BillingOrderItem orderItem) {
        this.orderItem = orderItem;
    }

}
