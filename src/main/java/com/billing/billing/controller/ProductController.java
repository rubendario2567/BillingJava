package com.billing.billing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.validation.Valid;

import com.billing.billing.model.Product;
import com.billing.billing.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
    
    @Autowired
    ProductService productSevice;

    @GetMapping("all")
    public List<Product> getAll(){
        return productSevice.getAll();
    }

    @PostMapping("/add")
    public Product setProduct(@Valid @RequestBody Product item){
        return productSevice.setProduct(item);
    }

    @PutMapping("/{productId}")
	public Product updateProduct(@PathVariable("productId") Long productId, @Valid @RequestBody Product item) {
		if (productId == item.getProductId()) {
			return productSevice.updateProduct(item);
		} else {
			return null;
		}
	}
}
