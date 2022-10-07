import business.ProductManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.HibernateProductDao;
import dataAccess.JdbcProductDao;
import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        Product product1 = new Product(1,"IPhone Xr", 100);
        ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product1);

        Product product2 = new Product(2,"Samsung", 50);
        ProductManager productManager2 = new ProductManager(new JdbcProductDao(),loggers);
        productManager2.add(product2);
    }
}
