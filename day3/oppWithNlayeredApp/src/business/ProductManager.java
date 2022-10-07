package business;



import core.logging.Logger;
import dataAccess.ProductDao;
import entities.Product;

//coding only business rules

public class ProductManager {

    private ProductDao productDao;
    private Logger[] loggers;
    
    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception{

        if(product.getUnitPrice() < 10 ){
            throw new Exception("ürün fiyatı 10'dan küçük olamaz");
        }
        else{
            productDao.add(product);
            for(Logger logger : loggers){
                logger.log(product.getName());
            }
        }

    }

}
