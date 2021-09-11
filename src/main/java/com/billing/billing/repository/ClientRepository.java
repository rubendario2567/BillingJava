package com.billing.billing.repository;

import com.billing.billing.model.*;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
