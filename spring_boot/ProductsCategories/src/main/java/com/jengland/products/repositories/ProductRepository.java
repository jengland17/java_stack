package com.jengland.products.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jengland.products.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{

}
