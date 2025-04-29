package com.inventariotibu.inv_tibu.domain.fkclass;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ProductProviderId implements Serializable {
    @Column(name = "product_id")
    private Long productId;
    @Column(name = "provider_id")
    private String providerId;


}
