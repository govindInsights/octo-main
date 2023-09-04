package com.vruksha.core.repos;

import com.vruksha.core.domain.BillingOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BillingOrderItemRepository extends JpaRepository<BillingOrderItem, String> {
}
