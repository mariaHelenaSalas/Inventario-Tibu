package com.inventariotibu.inv_tibu.domain.entities;



import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Table(name = "regions")
@Entity
public class Region {
    @Id
    @GeneratedValue
    int id;

    @Column(name = "name_region", length = 50, nullable = false)
    String name;

    @ManyToOne
    @JoinColumn(name = "countrys_id")
    @JsonBackReference
    Countrys countries; 


    @OneToMany(mappedBy  = "region",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private Set<City> cities = new HashSet<>();

}
