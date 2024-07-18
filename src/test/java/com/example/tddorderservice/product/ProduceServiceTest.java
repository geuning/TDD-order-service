package com.example.tddorderservice.product;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProduceServiceTest {

    private ProductService productService;

    @BeforeEach
    void setUp() {
        final ProductPort productPort = new ProductPort() {
            @Override
            public void save(final Product product) {

            }

            @Override
            public Product getProduct(final Long productId) {
                return null;
            }
        };

        productService = new ProductService(productPort);
    }


    @Test
    void 상품수정() {
        final Long productId = 1L;
        final UpdateProductRequest request = new UpdateProductRequest("상품 수정", 2000, DiscountPolicy.NONE);

        productService.updateProduct(productId, request);
    }

}
