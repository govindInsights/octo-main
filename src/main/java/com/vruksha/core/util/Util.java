package com.vruksha.core.util;

import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.UUID;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vruksha.core.domain.BillingOrder;
import com.vruksha.core.domain.BillingOrderItem;
import com.vruksha.core.model.BillingItem;
import com.vruksha.core.model.Voyage;

public class Util {

	public static String getUUID() {
		return UUID.randomUUID().toString();
	}
	
	public static BillingOrder convertVoyage(Voyage voyage) throws JsonProcessingException {
		BillingOrder billingOrder = new BillingOrder();
		if(voyage != null) {
			billingOrder.setOrderId(Util.getUUID());
			billingOrder.setChannel(voyage.getChannel());
			billingOrder.setEventCode(voyage.getEventCode());
			if(voyage.getCustomer() != null)
				billingOrder.setCustomer(new ObjectMapper().writeValueAsString(voyage.getCustomer()));
			
			BillingOrderItem orderItem = null;
			billingOrder.setOrderBillingOrderItems(new HashSet<BillingOrderItem>());
			for(BillingItem billingItem : voyage.getBillingItems()) {
				orderItem = new BillingOrderItem();
				orderItem.setOrderItemId(Util.getUUID());
				orderItem.setOrder(billingOrder);
				orderItem.setEventCode(billingOrder.getEventCode());
				orderItem.setChargeType(billingItem.getChargeType());
				orderItem.setVesselType(billingItem.getVesselType());
				orderItem.setStartTime(OffsetDateTime.parse(billingItem.getStartDateTime()));
				orderItem.setEndTime(OffsetDateTime.parse(billingItem.getEndDateTime()));
				orderItem.setPortCode(billingItem.getPortCode());
				orderItem.setMasterReferenceId(billingItem.getVesselReferenceId());
				billingOrder.getOrderBillingOrderItems().add(orderItem);
			}
		}
		return billingOrder;
	}
	
	public static BillingOrder convertVoyage(Voyage voyage, BillingOrder billingOrder) throws JsonProcessingException {
		
		if(voyage != null && billingOrder!= null) {
			
			
			BillingOrderItem orderItem = null;
			billingOrder.setOrderBillingOrderItems(new HashSet<BillingOrderItem>());
			for(BillingItem billingItem : voyage.getBillingItems()) {
				orderItem = new BillingOrderItem();
				orderItem.setOrderItemId(Util.getUUID());
				orderItem.setOrder(billingOrder);
				orderItem.setEventCode(billingOrder.getEventCode());
				orderItem.setChargeType(billingItem.getChargeType());
				orderItem.setVesselType(billingItem.getVesselType());
				orderItem.setStartTime(OffsetDateTime.parse(billingItem.getStartDateTime()));
				orderItem.setEndTime(OffsetDateTime.parse(billingItem.getEndDateTime()));
				orderItem.setPortCode(billingItem.getPortCode());
				orderItem.setMasterReferenceId(billingItem.getVesselReferenceId());
				billingOrder.getOrderBillingOrderItems().add(orderItem);
			}
		}
		return billingOrder;
	}
}
