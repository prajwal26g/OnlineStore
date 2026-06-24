package com.example.OnlineStore.Repository;

import com.example.OnlineStore.Entity.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Long>
{

}
