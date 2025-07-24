package com.ecommerce.product.Service;

import com.ecommerce.product.Model.Product;
import com.ecommerce.product.Repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.lang.*;
import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProductByCategory (Long categoryId) {
        return productRepository.findByCategoryId(categoryId);
    }
}
