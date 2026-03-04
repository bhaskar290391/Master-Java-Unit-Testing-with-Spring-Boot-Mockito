package com.parctise.testing.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parctise.testing.model.Items;

@Repository
public interface ItemsRepository extends JpaRepository<Items, Integer> {

}
