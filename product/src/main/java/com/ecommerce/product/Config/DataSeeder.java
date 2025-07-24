package com.ecommerce.product.Config;

import com.ecommerce.product.Model.Category;
import com.ecommerce.product.Model.Product;
import com.ecommerce.product.Repository.CategoryRepository;
import com.ecommerce.product.Repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {
      private final ProductRepository productRepository;
      private final CategoryRepository categoryRepository;
    public DataSeeder(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
          productRepository.deleteAll();
          categoryRepository.deleteAll();

          //create categories
        Category electronics=new Category();
        electronics.setName("Electronics");

        Category clothing=new Category();
        clothing.setName("Clothing");

        Category home =new Category();
        home.setName("Home and Appliances");
        categoryRepository.saveAll(Arrays.asList(electronics,clothing,home));

        //create products
        Product phone =new Product();
        phone.setName("Smart Phone");
        phone.setDescription("Latest SmartPhone");
        phone.setImageUrl("https://placehold.co/600x400 ");
        phone.setPrice(699.00);
        phone.setCategory(electronics);

        Product laptop =new Product();
        laptop.setName("Laptop");
        laptop.setDescription("High performance laptop");
        laptop.setImageUrl("https://placehold.co/600x400");
        laptop.setPrice(1699.00);
        laptop.setCategory(electronics);

        Product jacket =new Product();
        jacket.setName("Winter Jacket");
        jacket.setDescription("cozy winter jacket");
        jacket.setImageUrl("https://placehold.co/600x400");
        jacket.setPrice(299.00);
        jacket.setCategory(clothing);

        Product blender =new Product();
        blender.setName("Mixers and Blenders");
        blender.setDescription("High speed blenders");
        blender.setImageUrl("https://placehold.co/600x400");
        blender.setPrice(599.00);
        blender.setCategory(home);

        productRepository.saveAll(Arrays.asList(phone,laptop,jacket,blender));
    }
}
