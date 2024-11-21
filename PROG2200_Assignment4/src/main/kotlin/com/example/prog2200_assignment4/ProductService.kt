package com.example.prog2200_assignment4

import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired

@Service
class ProductService(
    @Autowired private val productRepository: ProductRepository
) {
    fun saveProduct(product: Product): Product {
        return productRepository.save(product)
    }

    fun getAllProducts(): List<Product> {
        return productRepository.findAll()
    }

    fun getProductById(id: Long): Product? {
        return productRepository.findById(id).orElse(null)
    }

    fun updateProduct(id: Long, updatedProduct: Product): Product {
        val product = productRepository.findById(id).orElseThrow {
            RuntimeException("Product not found")
        }
        product.name = updatedProduct.name
        product.description = updatedProduct.description
        product.price = updatedProduct.price
        return productRepository.save(product)
    }

    fun deleteProduct(id: Long) {
        productRepository.deleteById(id)
    }
}
