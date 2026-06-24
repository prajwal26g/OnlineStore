package com.example.OnlineStore.Repository;

import com.example.OnlineStore.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoductRepository extends JpaRepository<Product, Long>
{

}
