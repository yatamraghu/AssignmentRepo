package com.ecommerce.ecart.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;

	@Column
	private String displayName;

	@Column
	private String shortDescription;

	@Column
	private String description;

	@Column
	private String category;

	@Column
	private double price;

	@Column
	private double discount;

	@Column
	private double deliveryCharge;

	@Column
	private double offerPrice;

	@Column
	private String seller;

	@Column
	private int sellerCount;

	@Column
	private int avgRating;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getDeliveryCharge() {
		return deliveryCharge;
	}

	public void setDeliveryCharge(double deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}

	public double getOfferPrice() {
		return offerPrice;
	}

	public void setOfferPrice(double offerPrice) {
		this.offerPrice = offerPrice;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public int getSellerCount() {
		return sellerCount;
	}

	public void setSellerCount(int sellerCount) {
		this.sellerCount = sellerCount;
	}

	public int getAvgRating() {
		return avgRating;
	}

	public void setAvgRating(int avgRating) {
		this.avgRating = avgRating;
	}

	public Product() {

	}

	public Product(int productId, String displayName, String shortDescription, String description, String category,
			double price, double discount, double deliveryCharge, double offerPrice, String seller, int sellerCount,
			int avgRating) {
		super();
		this.productId = productId;
		this.displayName = displayName;
		this.shortDescription = shortDescription;
		this.description = description;
		this.category = category;
		this.price = price;
		this.discount = discount;
		this.deliveryCharge = deliveryCharge;
		this.offerPrice = offerPrice;
		this.seller = seller;
		this.sellerCount = sellerCount;
		this.avgRating = avgRating;
	}

}
