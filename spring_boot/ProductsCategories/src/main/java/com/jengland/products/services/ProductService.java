package com.jengland.products.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jengland.products.models.Category;
import com.jengland.products.models.Product;
import com.jengland.products.repositories.CategoryRepository;
import com.jengland.products.repositories.ProductRepository;

@Service
public class ProductService {
	
	private final ProductRepository productRepo;
	private final CategoryRepository categoryRepo;
	
	public ProductService(ProductRepository productRepo, CategoryRepository categoryRepo) {
		this.productRepo = productRepo;
		this.categoryRepo = categoryRepo;
	}
	
	public Product create(Product product) {
		return productRepo.save(product);
	}
	
	public Category create(Category category) {
		return categoryRepo.save(category);
	}
	
	public List<Category> getCategories() {
		return (List<Category>) categoryRepo.findAll();
	}
	
	public List<Product> getProducts() {
		return (List<Product>) productRepo.findAll();
	}
	
	public Category getCategory(Long id) {
		Optional<Category> category = categoryRepo.findById(id);
		return category.isPresent() ? category.get() : null;
	}
	
	public Product getProduct(Long id) {
		Optional<Product> product = productRepo.findById(id);
		return product.isPresent() ? product.get() : null;
	}
	
	public Product saveProduct(Product product) {
		return productRepo.save(product);
	}
	

}
