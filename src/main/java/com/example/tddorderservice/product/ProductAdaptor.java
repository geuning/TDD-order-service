package com.example.tddorderservice.product;

import org.springframework.stereotype.Component;

@Component
class ProductAdaptor implements ProductPort {

    private final ProductRepository productRepository;

    ProductAdaptor(final ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void save(final Product product) {
        productRepository.save(product);
    }
}
