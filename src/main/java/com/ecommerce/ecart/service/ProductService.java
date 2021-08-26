package com.ecommerce.ecart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ecommerce.ecart.entities.Product;
import com.ecommerce.ecart.repositories.ProductRepository;

@Service("ProductService")
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public Product findProductsByName(String productName) {
		return productRepository.findProductsByName(productName);
	}

	public ResponseEntity<Product> createProduct(Product product) {
		try {
			productRepository.save(new Product(product.getProductId(), product.getDisplayName(),
					product.getShortDescription(), product.getDescription(), product.getCategory(), product.getPrice(),
					product.getDiscount(), product.getDeliveryCharge(), product.getOfferPrice(), product.getSeller(),
					product.getSellerCount(), product.getAvgRating()));
			return new ResponseEntity<>(product, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public Product updateProduct(String name, Product productDetails) {
		Product product = productRepository.findProductsByName(name);
		product.setPrice(productDetails.getPrice());
		product.setDiscount(productDetails.getDiscount());
		product.setDeliveryCharge(productDetails.getDeliveryCharge());
		Product updateProduct = productRepository.save(product);
		return updateProduct;
	}
}
