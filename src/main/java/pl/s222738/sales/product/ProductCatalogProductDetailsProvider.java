package pl.s222738.sales.product;

import pl.s222738.productcatalog.Product;
import pl.s222738.productcatalog.ProductCatalog;

import java.util.Optional;

public class ProductCatalogDetailsProvider implements ProductDetailsProvider {

    ProductCatalog productCatalog;

    public ProductCatalogDetailsProvider(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    @Override
    public Optional<ProductDetails> loadForProduct(String productId) {
        Product product = productCatalog.loadById(productId);
        if (product == null) {
            return Optional.empty();
        }
        return Optional.of(new ProductDetails(
                product.getId(),
                product.getName(),
                product.getPrice()));
    }
}
