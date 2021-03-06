package com.svit.ecommerce;

import java.io.IOException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.svit.ecommerce.model.Product;
import com.svit.ecommerce.service.ProductService;

@SpringBootApplication
public class EcommerceApplication {

  public static void main(String[] args) {
    SpringApplication.run(EcommerceApplication.class, args);
  }

  @Bean
  CommandLineRunner runner(ProductService productService) throws IOException {
    // ClassPathResource TVimage = new ClassPathResource("images/tv.jpeg");
    // byte[] arrayPic = new byte[(int) TVimage.contentLength()];
    // TVimage.getInputStream().read(arrayPic);
    return args -> {
      productService.save(new Product(1L, "TV Set", 300.00, "/assets/img/tv.jpg"));
      productService.save(new Product(2L, "Game Console", 200.00, "http://placehold.it/200x100"));
      productService.save(new Product(3L, "Sofa", 100.00, "http://placehold.it/200x100"));
      productService.save(new Product(4L, "Icecream", 5.00, "http://placehold.it/200x100"));
      productService.save(new Product(5L, "Beer", 3.00, "http://placehold.it/200x100"));
      productService.save(new Product(6L, "Phone", 500.00, "http://placehold.it/200x100"));
      productService.save(new Product(7L, "Watch", 30.00, "http://placehold.it/200x100"));
      productService.save(new Product(8L, "Matress", 100.00, "http://placehold.it/200x100"));
    };
  }
}
