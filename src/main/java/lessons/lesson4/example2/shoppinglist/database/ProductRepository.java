package lessons.lesson4.example2.shoppinglist.database;


import lessons.lesson4.example2.shoppinglist.domain.Product;

public interface ProductRepository {

    void add(Product product);

    Product[] findAll();
}
