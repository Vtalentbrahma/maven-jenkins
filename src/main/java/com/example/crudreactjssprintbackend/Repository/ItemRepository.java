package com.example.crudreactjssprintbackend.Repository;

import com.example.crudreactjssprintbackend.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Long> {
}
