package pl.s222738;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.s222738.productcatalog.HashMapProductStorage;
import pl.s222738.productcatalog.ProductCatalog;

import java.math.BigDecimal;

@SpringBootApplication
public class App {
    public static void main(String[] args) {

        SpringApplication.run(App.class, args);
    }

    @Bean
    ProductCatalog createNewProductCatalog() {
        ProductCatalog productCatalog = new ProductCatalog(new HashMapProductStorage());

        String productId1 = productCatalog.addProduct("My ebok", "Nice one");
        productCatalog.assignImage(productId1, "images/nice.jpeg");
        productCatalog.changePrice(productId1, BigDecimal.TEN);
        productCatalog.publishProduct(productId1);

        String productId2 = productCatalog.addProduct("New Ebook", "Even nicer one");
        productCatalog.assignImage(productId2, "images/nice.jpeg");
        productCatalog.changePrice(productId2, BigDecimal.valueOf(20.20));
        productCatalog.publishProduct(productId2);

        return productCatalog;
    }
}