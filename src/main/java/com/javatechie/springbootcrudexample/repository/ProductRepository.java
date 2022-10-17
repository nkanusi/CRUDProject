package com.javatechie.springbootcrudexample.repository;

import com.javatechie.springbootcrudexample.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.print.attribute.IntegerSyntax;


public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByName(String name);


}
