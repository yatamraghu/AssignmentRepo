package com.ecommerce.ecart.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecart.entities.Product;
import com.ecommerce.ecart.service.ProductService;

@RestController
@RequestMapping("/productsapi")
public class ProductsController {

	@Autowired
	private ProductService productService;

	@GetMapping("/searchProduct/{name}")
	public Product getProductsByName(@PathVariable(value = "name") String productName) {
		return productService.findProductsByName(productName);
	}

	@GetMapping("/{name}/details")
	public Product getProductDetailsByName(@PathVariable(value = "name") String productName) {
		return productService.findProductsByName(productName);
	}

	@PostMapping("/product/add")
	public ResponseEntity<Product> createComment(@RequestBody Product product) {
		return productService.createProduct(product);
	}

	@PutMapping("/product/{productName}/modify")
	public Product updayeProduct(@PathVariable(value = "productName") String name,
			@RequestBody Product productDetails) {
		return productService.updateProduct(name, productDetails);
	}

}
