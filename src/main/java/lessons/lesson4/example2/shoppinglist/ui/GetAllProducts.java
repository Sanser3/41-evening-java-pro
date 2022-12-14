package lessons.lesson4.example2.shoppinglist.ui;


import lessons.lesson4.example2.shoppinglist.businesslogic.ProductService;
import lessons.lesson4.example2.shoppinglist.domain.Product;

public class GetAllProducts implements MenuCommand {

    private final ProductService service;

    public GetAllProducts(ProductService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {
        Product[] products = service.findAll();
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }

    @Override
    public String getMenuName() {
        return "Get All Products";
    }
}
