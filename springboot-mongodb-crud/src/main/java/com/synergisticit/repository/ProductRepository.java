package com.synergisticit.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.synergisticit.model.Product;

public interface ProductRepository extends MongoRepository<Product, Long>{

}
