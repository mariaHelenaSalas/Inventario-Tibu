package com.inventariotibu.inv_tibu.domain.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Table(name = "products")
@Entity
public class Product {
  
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY) 
   private int Id;

   @Column(name = "product_stock", columnDefinition = "INTEGER", length = 50, nullable = true)
   int stock;

   @Column(name = "product_name", length = 50, nullable = true)
   int productName;

   @OneToMany(mappedBy = "product")
   private Set<ProductProvider> productProvider = new HashSet<>();
    
}
