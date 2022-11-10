package oopWithNLayeredApp.business;            
import oopWithNLayeredApp.core.Logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    
    
    public ProductManager(ProductDao productDao, Logger[] _loggers) {
        this.productDao = productDao;
        this.loggers = _loggers;
    }



    public void add(Product product) throws Exception{
        // İş Kuralları

        if(product.getUnitPrice() < 10){
            throw new Exception("Ürün fiyatı ondan küçük olamaz");
        }

        // ProductDao productDao = new JdbcProductDao();
        productDao.add(product);

        for (Logger logger : loggers) { // [db , mail , file] 
            logger.log(product.getName());
        }
        
        
    }


}
