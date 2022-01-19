package com.example.SpringWithPostgres.service;

import com.example.SpringWithPostgres.entity.Product;
import com.example.SpringWithPostgres.repository.Product_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private Product_Repository repository;

    //Post Method for single product
    public Product saveProduct(Product product)
    {
       return repository.save(product);
    }
    //Post Method for All product
    public List<Product> saveProducts(List<Product> products)
    {
        return repository.saveAll(products);
    }

    //Get Method to read One product by Id
    public Product getProductById(int id){
        return repository.findById(id).orElse(null);
    }
    //Get Method to read All product
    public List<Product> getProducts()
    {
        return repository.findAll();
    }
    //Get Method to read One product by Name
    public Product getProductByName(String name){
        return repository.findByName(name);
    }
    //Delete method to delete one product based on id

   public Product getProductByPrice(double price){
        return repository.findByPrice(price);
   }
    public String deleteProduct(int id){
         repository.deleteById(id);
         return "Product removed: "+id;
    }
    //update product to existing product
    public Product updateProduct(Product product){
        Product existingProduct=repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }

}














