package com.billing.billing.repository;

import com.billing.billing.model.*;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
