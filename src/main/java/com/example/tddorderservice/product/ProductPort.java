package com.example.tddorderservice.product;

interface ProductPort {
    void save(final Product product);

    Product getProduct(Long productId);
}
