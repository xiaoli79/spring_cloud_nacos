package org.example.productservice.controller;


import lombok.NonNull;
import org.example.productservice.model.ProductInfo;
import org.example.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {


    @Autowired
    private ProductService productService;


    @RequestMapping("/{productId}")
    public ProductInfo selectProductInfoById(@PathVariable("productId") @NonNull Integer productId) {
        return productService.selectProductInfoByProductId(productId);

    }
}
