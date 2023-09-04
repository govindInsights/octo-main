package com.vruksha.core.repos;

import com.vruksha.core.domain.BillingOrder;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BillingOrderRepository extends JpaRepository<BillingOrder, String> {
}
