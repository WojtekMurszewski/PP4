package pl.s222738;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.s222738.productcatalog.HashMapProductStorage;
import pl.s222738.productcatalog.ProductCatalog;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    ProductCatalog createNewProductCatalog() {
        return new ProductCatalog(new HashMapProductStorage());
    }
}