package com.ecommerce.ecart.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;

import com.ecommerce.ecart.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

	@Query(value = "select * from products where products.display_name = ?1", nativeQuery = true)
	Product findProductsByName(String displayName);

	@Query(value = "select * from products where products.display_name = ?1", nativeQuery = true)
	boolean isProductExistWithName(String displayName);

}
