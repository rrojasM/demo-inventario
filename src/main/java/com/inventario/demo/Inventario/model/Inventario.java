package com.inventario.demo.Inventario.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Document(collection = "Inventario")
public class Inventario {
	@Id
	@Field("_id")
	private String id;

	private String category;
	private String productName;
	private Double price;
	private String description;
	private boolean isOff;
	private boolean isAvailable;
	private String productImage;
	private Integer stock;
	
	
	public Inventario() {
		
	}


	public Inventario(String id, String category, String productName, Double price, String description, boolean isOff,
			boolean isAvailable, String productImage, Integer stock) {
		super();
		this.id = id;
		this.category = category;
		this.productName = productName;
		this.price = price;
		this.description = description;
		this.isOff = isOff;
		this.isAvailable = isAvailable;
		this.productImage = productImage;
		this.stock = stock;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public boolean isOff() {
		return isOff;
	}


	public void setOff(boolean isOff) {
		this.isOff = isOff;
	}


	public boolean isAvailable() {
		return isAvailable;
	}


	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}


	public String getProductImage() {
		return productImage;
	}


	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}


	public Integer getStock() {
		return stock;
	}


	public void setStock(Integer stock) {
		this.stock = stock;
	}


	@Override
	public String toString() {
		return "Inventario [id=" + id + ", category=" + category + ", productName=" + productName + ", price=" + price
				+ ", description=" + description + ", isOff=" + isOff + ", isAvailable=" + isAvailable
				+ ", productImage=" + productImage + ", stock=" + stock + "]";
	}
	
}
