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
public class Invoice {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "longtext")
    private String documentStream;

    @Column
    private OffsetDateTime invoiceDate;

    @Column
    private OffsetDateTime insertDate;

    @Column(length = 45)
    private String createdUser;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    private BillingOrder order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_item_id")
    private BillingOrderItem orderItem;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getDocumentStream() {
        return documentStream;
    }

    public void setDocumentStream(final String documentStream) {
        this.documentStream = documentStream;
    }

    public OffsetDateTime getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(final OffsetDateTime invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public OffsetDateTime getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(final OffsetDateTime insertDate) {
        this.insertDate = insertDate;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(final String createdUser) {
        this.createdUser = createdUser;
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
