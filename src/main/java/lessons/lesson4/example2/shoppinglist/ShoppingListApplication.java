package lessons.lesson4.example2.shoppinglist;


import lessons.lesson4.example2.shoppinglist.businesslogic.ProductService;
import lessons.lesson4.example2.shoppinglist.database.ProductRepository;
import lessons.lesson4.example2.shoppinglist.database.ProductRepositoryArrayImpl;
import lessons.lesson4.example2.shoppinglist.ui.*;

class ShoppingListApplication {

    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepositoryArrayImpl();

        ProductService service = new ProductService(productRepository);

        AddProduct addProduct = new AddProduct(service);
        GetAllProducts getAllProducts = new GetAllProducts(service);
        ExitMenuCommand exitMenuCommand = new ExitMenuCommand();

        MenuCommand[] menuCommands = {
                addProduct,
                getAllProducts,
                exitMenuCommand
        };

        UserMenu ui = new UserMenu(menuCommands);
        ui.startUserMenu();
    }
}
