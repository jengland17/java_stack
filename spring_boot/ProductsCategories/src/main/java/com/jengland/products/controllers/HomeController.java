package com.jengland.products.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jengland.products.models.Category;
import com.jengland.products.models.Product;
import com.jengland.products.services.ProductService;

@Controller
public class HomeController {
	
	private final ProductService productServ;
	
	public HomeController(ProductService productServ) {
		this.productServ = productServ;
	}
	
	@GetMapping("/products/new")
	public String addProduct(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("category", new Category());
		model.addAttribute("products", productServ.getProducts());
		model.addAttribute("categories", productServ.getCategories());
		return "product.jsp";
	}
	
	@PostMapping("/products")
	public String addProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if (result.hasErrors()) {
			return "product.jsp";
		} else {
			productServ.create(product);
			return "redirect:/products/new";
		}
	}
	
	@PostMapping("/categories")
	public String addCategory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if (result.hasErrors()) {
			return "product.jsp";
		} else { 
			productServ.create(category);
			return "redirect:/products/new";
		}
	}
	
	@PostMapping("/addCategory")
	public String addToProduct(@RequestParam("product_id") Long productId, @RequestParam("category_id") Long categoryId) {
		Product product = productServ.getProduct(productId);
		Category category = productServ.getCategory(categoryId);
		List<Category> productCategory = product.getCategories();
		productCategory.add(category);
		productServ.saveProduct(product);
		return "redirect:/products/new";
		
	} 
	

}
